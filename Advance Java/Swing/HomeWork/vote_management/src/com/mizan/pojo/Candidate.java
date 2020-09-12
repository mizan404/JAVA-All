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
public class Candidate {
    private String candidateid; 
    private String name;
    private String party_leader;
    private String sex;
    private String age;
    private String partyHQ;
    private String partysign;
    private byte[] candidateImage; 

    public Candidate(String candidateid, String name, String party_leader, String sex, String age, String partyHQ, String partysign, byte [] candidateImage) {
        this.candidateid = candidateid;
        this.name = name;
        this.party_leader = party_leader;
        this.sex = sex;
        this.age = age;
        this.partyHQ = partyHQ;
        this.partysign = partysign;
        this.candidateImage= candidateImage; 
    }

    

    public String getCandidateid() {
        return candidateid;
    }

    public String getName() {
        return name;
    }

    public String getParty_leader() {
        return party_leader;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getPartyHQ() {
        return partyHQ;
    }

    public String getPartysign() {
        return partysign;
    }

    public byte[] getCandidateImage() {
        return candidateImage;
    }
    

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParty_leader(String party_leader) {
        this.party_leader = party_leader;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPartyHQ(String partyHQ) {
        this.partyHQ = partyHQ;
    }

    public void setPartysign(String partysign) {
        this.partysign = partysign;
    }

    public void setCandidateImage(byte[] candidateImage) {
        this.candidateImage = candidateImage;
    }
    

    
    
    
}
