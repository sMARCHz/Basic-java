package com.example.hellorest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public List<UserModel> getAllUsers() {
        String url = "https://jsonplaceholder.typicode.com/users";
        UserModel[] result = restTemplate.getForObject(url, UserModel[].class);
        return Arrays.asList(result);
    }

    public UserModel getUserByID(int id) {
        String url = "https://jsonplaceholder.typicode.com/users/" + id;
        UserModel user = restTemplate.getForObject(url, UserModel.class);
        return user;
    }
}
