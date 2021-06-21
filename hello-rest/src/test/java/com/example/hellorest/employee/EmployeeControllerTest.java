package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void callApiWithPathVariable() {
        EmployeeResponse expected = new EmployeeResponse(123, "Nattanon", "Ch");
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
}