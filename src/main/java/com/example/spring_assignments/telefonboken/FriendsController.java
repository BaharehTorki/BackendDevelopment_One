package com.example.spring_assignments.telefonboken;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendsController {
    FriendsDAO friendsDAO = new FriendsDAO();
    List<FriendsPOJO> friendsList = friendsDAO.getFriendsList();
    @GetMapping("/friends")
    public List<FriendsPOJO> getAllFriends(){
       return friendsList;
    }
}
