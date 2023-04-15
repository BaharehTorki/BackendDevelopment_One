package com.example.spring_assignments.telefonboken;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class FriendsPOJO {
    private int id;
    private String name;
    private String nickName;
    private List<String> phoneNumbers;
    private String birthday;
    private List<String> otherAdress;

}
