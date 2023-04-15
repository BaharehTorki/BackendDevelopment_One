package com.example.spring_assignments.telefonboken;

import java.util.ArrayList;
import java.util.List;

public class FriendsDAO {
    public List<FriendsPOJO> getFriendsList(){

        List<FriendsPOJO> friendsList = new ArrayList<>();

        List<String> phones1 = new ArrayList<>();
        phones1.add("0731211234");
        phones1.add("0738789767");
        List<String> adress1 = new ArrayList<>();
        adress1.add("Solnavägen4");

        List<String> phones2 = new ArrayList<>();
        phones2.add("0731245456");
        phones2.add("0732349879");
        List<String> adress2 = new ArrayList<>();
        adress2.add("Frösundavägen5");
        adress2.add("Kolonvägen6");
        adress2.add("Råsundavägen7");

        List<String> phones3 = new ArrayList<>();
        phones3.add("0738712343");
        phones3.add("0731767876");
        phones3.add("0732767865");
        List<String> adress3 = new ArrayList<>();
        adress3.add("Rissneleden45");
        adress3.add("Samuelsgatan56");

        List<String> phones4 = new ArrayList<>();
        phones4.add("0731744545");
        List<String> adress4 = new ArrayList<>();
        adress4.add("Barkarbyvägen45");

        List<String> phones5 = new ArrayList<>();
        phones5.add("0731744545");
        phones5.add("0732234323");
        phones5.add("0732234323");
        List<String> adress5 = new ArrayList<>();
        adress5.add("Månadsvägen14");
        adress5.add("Sunbybargvägen14");
        adress5.add("Veckovägen44");

        FriendsPOJO f1 = new FriendsPOJO(1, "Simon Edlund", "Victor", phones1, "2011-05-23", adress1);
        FriendsPOJO f2 = new FriendsPOJO(2, "Danielle Johansson", "Sofia", phones2, "2008-04-16", adress2 );
        FriendsPOJO f3 = new FriendsPOJO(3, "Cristian Gustavsson", "Izabel", phones3,"2000-01-10", adress3);
        FriendsPOJO f4 = new FriendsPOJO(4, "Emilia Davidsson" ,"Izabel", phones4, "1990-04-22", adress4 );
        FriendsPOJO f5 = new FriendsPOJO(5, "Viliam Björklund", "Samuel", phones5, "1790-05-11", adress5);

        friendsList.add(f1);
        friendsList.add(f2);
        friendsList.add(f3);
        friendsList.add(f4);
        friendsList.add(f5);

        return friendsList;
    }
}
