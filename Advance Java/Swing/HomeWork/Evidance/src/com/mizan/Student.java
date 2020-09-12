package com.mizan;

public class Student {
private String name; 
private String contact; 
private String email; 
private String gender; 
private String course; 
private String remark; 
private String location; 

    public Student() {
    }

    public Student(String name, String contact, String email, String gender, String course, String remark, String location) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.course = course;
        this.remark = remark;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
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

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Student{" + "name=" + name + ", contact=" + contact + ", email=" + email + ", gender=" + gender + ", course=" + course + ", remark=" + remark + ", location=" + location + '}';
    }

}
