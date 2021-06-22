package com.example.hellorest.user;

import org.h2.engine.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserList expectedUserList;

    @Test
    public void getAllUserTest() {
        UserResponse[] response = restTemplate.getForObject("/user", UserResponse[].class);
        List<UserResponse> actualResponse = Arrays.asList(response);
        assertEquals(expectedUserList.getUsersList(), actualResponse);
    }

    @Test
    public void getUserByIDTest() {
        UserResponse response = restTemplate.getForObject("/user/1", UserResponse.class);
        assertEquals(expectedUserList.getUserByID(1), response);
    }
}