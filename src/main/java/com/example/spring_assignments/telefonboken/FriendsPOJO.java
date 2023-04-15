package com.example.spring_assignments.telefonboken;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class FriendsPOJO {
    private int id;
    private String name;
    private String phoneNumber;

}
