package com.example.hellorest.user;

import java.util.ArrayList;
import java.util.List;

public class UserResponseList {
    private List<UserResponse> userList;

    public UserResponseList() {
        this.userList = new ArrayList<>();
    }

    public List<UserResponse> getUserList() {
        return userList;
    }
}
