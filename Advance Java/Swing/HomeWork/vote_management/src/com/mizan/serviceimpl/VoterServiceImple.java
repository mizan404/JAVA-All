/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.serviceimpl;

import com.mizan.connection.DBConnection;
import com.mizan.pojo.Voter;
import com.mizan.service.CommonService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mohdm
 */
public class VoterServiceImple implements CommonService<Voter> {

    static Connection connect = DBConnection.getConnection();

    @Override
    public void createTable() {
        String addvoter = "create table addvoter(id varchar(11) primary key ,"
                + "mobile_number varchar(11) not null,"
                + "name varchar(50) not null,"
                + "fathername varchar(50) not null,"
                + "address varchar(50) not null,"
                + "sex varchar(50) not null,"
                + "age varchar(50) not null,"
                + "voter_image BLOB)";
        try {
            PreparedStatement ps = connect.prepareStatement(addvoter);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void save(Voter t) {
        String addvoter = "insert into addvoter (id, mobile_number, name, fathername, address, sex, age, voter_image) value (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.prepareCall(addvoter);
            ps.setString(1, t.getid());
            ps.setString(2, t.getMobileNumber());
            ps.setString(3, t.getName());
            ps.setString(4, t.getFathername());
            ps.setString(5, t.getAddress());
            ps.setString(6, t.getSex());
            ps.setInt(7, t.getAge());
            ps.setBytes(8, t.getVoterImage());
            ps.executeUpdate();

        } catch (SQLException e) {
        }

    }

    @Override
    public void update(Voter t) {
        String addvoter = "update addvoter set mobile_number =?, name=?, fathername=?, address=?, sex=?, age=?, voter_image=? where id=?";
        try {
            PreparedStatement ps = connect.prepareCall(addvoter);
            ps.setString(1, t.getMobileNumber());
            ps.setString(2, t.getName());
            ps.setString(3, t.getFathername());
            ps.setString(4, t.getAddress());
            ps.setString(5, t.getSex());
            ps.setInt(6, t.getAge());
            ps.setBytes(7, t.getVoterImage());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    @Override
    public void delete(String id) {
        String addvoter = "detele from addvoter where id=?";
        try {
            PreparedStatement ps = connect.prepareCall(addvoter);
            ps.setString(1, id);
            ps.execute();
        } catch (Exception e) {
        }
    }

    @Override
    public void delete() {
        String sql = "delete from addvoter";

        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
        }

    }

    @Override
    public Voter get(String id) {
        Voter voter = null;
        String addvoter = " select * from addvoter where voterid=?";
        try {
            PreparedStatement ps = connect.prepareCall(addvoter);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                voter = new Voter(rs.getString("id"), rs.getString("mobile_number"), rs.getString("name"), rs.getString("fathername"), rs.getString("address"), rs.getString("sex"), rs.getInt("age"), rs.getBytes("voter_image"));

            }
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
        return voter;
    }

    @Override
    public ArrayList<Voter> getList() {
        ArrayList<Voter> voter_list = new ArrayList<Voter>();
        String addvoter = "select * from addvoter";

        try {
            PreparedStatement ps = connect.prepareCall(addvoter);
            ResultSet rs = ps.executeQuery();
            Voter voter;
            while (rs.next()) {
                voter = new Voter(rs.getString("id"),
                        rs.getString("mobile_number"),
                        rs.getString("name"),
                        rs.getString("fathername"),
                        rs.getString("address"),
                        rs.getString("sex"),
                        rs.getInt("age"),
                        rs.getBytes("voter_image"));
                voter_list.add(voter);
            }
        } catch (SQLException ex) {
        }
        return voter_list;
    }

    @Override
    public Voter getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Voter getUserByUsernameAndPassword(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
