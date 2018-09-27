package com.example.trinity.loginandregistration;

public class User {

    int id;
    private String username, email,gender;

    public User(String username, String email,String gender,int id) {
        this.id=id;
        this.username = username;
        this.email = email;
        this.gender = gender;

    }


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }
}

