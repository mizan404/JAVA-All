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
public class Winner {

    private int id;
    private String partyname;
    private int count;
    

    public Winner(int id, String partyname, int count) {
        this.id = id;
        this.partyname = partyname;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getPartyname() {
        return partyname;
    }

    public int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPartyname(String partyname) {
        this.partyname = partyname;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
