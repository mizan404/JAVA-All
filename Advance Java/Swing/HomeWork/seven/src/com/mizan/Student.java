/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

/**
 *
 * @author mohdm
 */
public class Student {
    private String name; 
    private String age; 
    private String contact; 
    private String gender; 
    private String course; 
    private String remark; 
    private String location; 

    public Student() {
    }

    public Student(String name, String age, String contact, String gender, String course, String remark, String location) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.gender = gender;
        this.course = course;
        this.remark = remark;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getContact() {
        return contact;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getRemark() {
        return remark;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", contact=" + contact + ", gender=" + gender + ", course=" + course + ", remark=" + remark + ", location=" + location + '}';
    }

}
