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
public class CastedVoter {

    private int voterid;
    private String name;

    public CastedVoter(int voterid, String name) {
        this.voterid = voterid;
        this.name = name;
    }

    public int getVoterid() {
        return voterid;
    }

    public String getName() {
        return name;
    }

    public void setVoterid(int voterid) {
        this.voterid = voterid;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
