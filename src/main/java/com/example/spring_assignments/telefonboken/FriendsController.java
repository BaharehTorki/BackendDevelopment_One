package com.example.spring_assignments.telefonboken;

import com.example.spring_assignments.book.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendsController {
    FriendsDAO friendsDAO = new FriendsDAO();
    List<Friends> friendsList = friendsDAO.getFriendsList();
    @GetMapping("/friends")
    public List<Friends> getAllFriends(){
       return friendsList;
    }

    @GetMapping("/friends/{id}")
    public Friends getFriendsById(@PathVariable int id){
        return friendsList.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    @GetMapping("/friends/{name}")
    public Friends getFriendsByName(@PathVariable String name){
        return friendsList.stream().filter(n -> n.getName() == name).findFirst().orElse(null);
    }

  /*  @GetMapping("/friends/getByName")
    public Friends addByGET(@RequestParam String name) {
        return friendsList.stream().filter(n -> n.getName().equals(name)).findFirst().orElse(null);
    }*/

}
