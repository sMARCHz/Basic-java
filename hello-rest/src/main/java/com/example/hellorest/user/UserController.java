package com.example.hellorest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserGateway gateway;

    @GetMapping("/user/even")
    public List<UserModel> getAllEvenIDUser() {
        List<UserModel> users = gateway.getAllUsers();
        List<UserModel> evenIDUsers = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() % 2 == 0) {
                evenIDUsers.add(users.get(i));
            }
        }
        return evenIDUsers;
    }
}
