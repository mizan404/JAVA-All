package com.mizan.pojo;

public class User {

    private int id;
    private String name;
    private String username;
    private String password;
    private boolean status;
    private String email;
    private String photoUrl;
    private String gender;
    private String note;

    public User() {
    }

    public User(int id, String name, String username, String password, boolean status, String email, String photoUrl, String gender, String note) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.status = status;
        this.email = email;
        this.photoUrl = photoUrl;
        this.gender = gender;
        this.note = note;
    }

    public User(String name, String username, String password, boolean status, String email, String photoUrl, String gender, String note) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.status = status;
        this.email = email;
        this.photoUrl = photoUrl;
        this.gender = gender;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getGender() {
        return gender;
    }

    public String getNote() {
        return note;
    }

  
}
