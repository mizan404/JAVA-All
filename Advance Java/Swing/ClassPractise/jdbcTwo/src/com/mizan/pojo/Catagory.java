/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.pojo;

/**
 *
 * @author Students
 */
public class Catagory {
    private int id; 
    private String name; 
    private String note; 

    public Catagory() {
    }

    public Catagory(int id, String name, String note) {
        this.id = id;
        this.name = name;
        this.note = note;
    }

    public Catagory(String name, String note) {
        this.name = name;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setNote(String note) {
        this.note = note;
    }
    
}
