package com.example.spring_assignments.kompis;

import java.io.Serializable;

public class Friend implements Serializable {

    private int id;
    private String name;
    private String adress;
    private String phoneNumber;

    public Friend() {
    }

    public Friend(int id, String name, String adress, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Friend [id" + id + ", name = " + name + "adress = " + adress + "phoneNumber" + phoneNumber + "]";
    }
}


