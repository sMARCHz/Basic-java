package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private EmployeeRepository repository;

    @MockBean
    private Random random;

    @Test
    public void callApiWithPathVariableAndDatabase() {
        when(random.nextInt(anyInt())).thenReturn(5);
        repository.save(new Employee(123, "Nattanon", "Ch"));

        EmployeeResponse expected
                = new EmployeeResponse(123, "Nattanon5", "Ch");
        EmployeeResponse response
                = restTemplate.getForObject("/employee/123", EmployeeResponse.class);
        assertEquals(123, response.getId());
        assertEquals("Nattanon5", response.getFname());
        assertEquals("Ch", response.getLname());
        assertEquals(expected, response);
    }

    @Test
    public void callApiWithRequestParameter() {
        EmployeeResponse response
                = restTemplate.getForObject("/employee?id=999", EmployeeResponse.class);
        assertEquals(999, response.getId());
        assertEquals("Nattanon", response.getFname());
        assertEquals("Ch", response.getLname());
    }

    @Test
    public void postApiTestWithRequestBody() {
        EmployeeRequest request = new EmployeeRequest("Nattanon", "Ch");
        EmployeeResponse response
                = restTemplate.postForObject("/employee", request, EmployeeResponse.class);
        assertEquals(999, response.getId());
        assertEquals("Nattanon", response.getFname());
        assertEquals("Ch", response.getLname());
    }
}