package com.example.hellorest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public Users getAllUsers() {
        String url = "https://jsonplaceholder.typicode.com/users";
        UserModel[] result = restTemplate.getForObject(url, UserModel[].class);
        Users users = new Users(Arrays.asList(result));
        return users;
    }

    public UserModel getUserByID(int id) {
        String url = "https://jsonplaceholder.typicode.com/users/" + id;
        UserModel user = restTemplate.getForObject(url, UserModel.class);
        return user;
    }
}
