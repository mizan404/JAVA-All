package com.mizan.pojo;

public class Student {
private int id; 
private String name; 
private String email; 
private String gender; 
private String round; 
private String note; 

    public Student() {
    }

    public Student(int id, String name, String email, String gender, String round, String note) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.round = round;
        this.note = note;
    }

    public Student(String name, String email, String gender, String round, String note) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.round = round;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getRound() {
        return round;
    }

    public String getNote() {
        return note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
