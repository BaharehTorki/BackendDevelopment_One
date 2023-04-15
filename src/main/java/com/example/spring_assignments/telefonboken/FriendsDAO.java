package com.example.spring_assignments.telefonboken;

import java.util.ArrayList;
import java.util.List;

public class FriendsDAO {
    public List<FriendsPOJO> getFriendsList(){

        List<FriendsPOJO> friendsList = new ArrayList<>();

        FriendsPOJO f1 = new FriendsPOJO(1, "Simon Edlund", "0731211234");
        FriendsPOJO f2 = new FriendsPOJO(2, "Danielle Johansson", "07328790578");
        FriendsPOJO f3 = new FriendsPOJO(3, "Cristian Gustavsson", "07376894056");
        FriendsPOJO f4 = new FriendsPOJO(4, "Emilia Davidsson", "0732342678");
        FriendsPOJO f5 = new FriendsPOJO(5, "Viliam Björklund", "0733456345");

        friendsList.add(f1);
        friendsList.add(f2);
        friendsList.add(f3);
        friendsList.add(f4);
        friendsList.add(f5);

        return friendsList;
    }

}
