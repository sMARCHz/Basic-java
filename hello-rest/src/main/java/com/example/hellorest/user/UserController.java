package com.example.hellorest.user;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    private final List<UserResponse> usersList = new ArrayList<>(Arrays.asList(
            new UserResponse(1, "Leanne Graham", "Bret", "Sincere@april.biz"
                    , new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874"
                    , new Geo(-37.3159, 81.1496))
                    , "1-770-736-8031 x56442", "hildegard.org"
                    , new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets")
            ),
            new UserResponse(2, "Ervin Howell", "Antonette", "Shanna@melissa.tv"
                    , new Address("Victor Plains", "Suite 879", "Wisokyburgh", "90566-7771"
                    , new Geo(-43.9509, -34.4618))
                    , "010-692-6593 x09125", "anastasia.net"
                    , new Company("Deckow-Crist", "Proactive didactic contingency", "synergize scalable supply-chains")
            )
    ));

    public List<UserResponse> getUserList() {
        return usersList;
    }

    @GetMapping("/user")
    public List<UserResponse> getAllUsers() {
        return usersList;
    }

    @GetMapping("/user/{id}")
    public UserResponse getUserByID(@PathVariable String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException err) {
            System.out.println("Invalid ID.");
        }
        for (UserResponse user : usersList) {
            if(user.getId() == _id) {
                return user;
            }
        }
        return null;
    }
}
