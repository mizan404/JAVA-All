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
public class PartyCount {
    int count; 
    String partyname; 

    public PartyCount(int count, String partyname) {
        this.count = count;
        this.partyname = partyname;
    }

    public int getCount() {
        return count;
    }

    public String getPartyname() {
        return partyname;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPartyname(String partyname) {
        this.partyname = partyname;
    }
    
    
}
