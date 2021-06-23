package com.example.hellorest.userassignment;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class UserList {
    private List<UserResponse> usersList = new ArrayList<>(Arrays.asList(
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

    public List<UserResponse> getUsersList() {
        return usersList;
    }

    public UserResponse getUserByID(int id) {
        for (UserResponse user : usersList) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserList userList = (UserList) o;
        return Objects.equals(usersList, userList.getUsersList());
    }
}
