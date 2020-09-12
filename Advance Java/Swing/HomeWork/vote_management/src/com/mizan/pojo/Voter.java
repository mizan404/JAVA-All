/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.pojo;

/**
 *
 * @author mohdm
 */
public class Voter {

    private String voterid;
    private String mobileNumber;

    private String name;
    private String fathername;
    private String address;
    private String sex;
    private int age;
    private byte[] voterImage;

    public Voter(String voterid, String mobileNumber, String name, String fathername, String address, String sex, int age, byte[] voterimage) {
        this.voterid = voterid;
        this.mobileNumber = mobileNumber;

        this.name = name;
        this.fathername = fathername;
        this.address = address;
        this.sex = sex;
        this.age = age;
        this.voterImage = voterimage;
    }

    public String getVoterid() {
        return voterid;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getFathername() {
        return fathername;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public byte[] getVoterImage() {
        return voterImage;
    }

    public void setVoterid(String voterid) {
        this.voterid = voterid;
    }

    public void setMobileNumber(String password) {
        this.mobileNumber = mobileNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVoterImage(byte[] voterImage) {
        this.voterImage = voterImage;
    }

}
