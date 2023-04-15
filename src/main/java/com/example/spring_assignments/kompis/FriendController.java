package com.example.spring_assignments.kompis;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {

    @RequestMapping(value = "/friend/{friendId}", method = RequestMethod.GET)

    //getFriend method which accept friend ids path variable
    public Friend getFriend(@PathVariable int friendId){
        Friend friend = new Friend();
        friend.setId(friendId);
        friend.setName("Lina");
        friend.setAdress("Samuelsgatan70");
        friend.setPhoneNumber("0731231234");
        return friend;
    }
}
