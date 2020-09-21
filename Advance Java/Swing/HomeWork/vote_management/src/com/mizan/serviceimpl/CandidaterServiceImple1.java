/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.serviceimpl;

import com.mizan.connection.DBConnection;
import com.mizan.pojo.Candidate;
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
public class CandidaterServiceImple1 implements CommonService<Candidate> {

    static Connection connect = DBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table addcandidate (candidateid varchar(11) primary key ,"
                + "partyname varchar(50) not null,"
                + "partyleader varchar(50) not null,"
                + "sex varchar(50) not null,"
                + "age int(11) not null,"
                + "partyHQ varchar(50) not null,"
                + "partysign varchar(50) not null,"
                + "candidate_image BLOB)";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void save(Candidate t) {
        String sql = "insert into addcandidate (candidateid, partyname, partyleader, sex, age, partyHQ, partysign, candidate_image) value (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setString(1, t.getCandidateid());
            ps.setString(2, t.getName());
            ps.setString(3, t.getParty_leader());
            ps.setString(4, t.getSex());
            ps.setString(5, t.getAge());
            ps.setString(6, t.getPartyHQ());
            ps.setString(7, t.getPartysign());
            ps.setBytes(8, t.getCandidateImage());
            ps.executeUpdate();

        } catch (SQLException e) {
        }

    }

    @Override
    public void update(Candidate t) {
        String sql = "update addcandidate set  partyname=?, partyleader=?, sex=?, age=?, partyHQ=?, partysign=?, candidate_image=? where voterid=?";
        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getParty_leader());
            ps.setString(3, t.getSex());
            ps.setString(4, t.getAge());
            ps.setString(5, t.getPartyHQ());
            ps.setString(6, t.getPartysign());
            ps.setBytes(7, t.getCandidateImage());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    @Override
    public void delete(String id) {
        String sql = "detele from addcandidate where candidateid=?";
        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void delete() {
        String sql = "delete from addcandidate";

        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
        }

    }

    @Override
    public Candidate get(String id) {
        Candidate candidate = null;
        String sql = " select * from addvoter where voterid=?";
        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                candidate = new Candidate(rs.getString("candidateid"), rs.getString("name"), rs.getString("partyleader"), rs.getString("sex"), rs.getString("age"), rs.getString("partyHQ"), rs.getString("partysign"), rs.getBytes("candidate_image"));

            }
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
        return candidate;
    }

    @Override
    public ArrayList<Candidate> getList() {
        ArrayList<Candidate> candidate_list = new ArrayList<Candidate>();
        String sql = "select * from addcandidate";

        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            Candidate candidate;
            while (rs.next()) {
                candidate = new Candidate(
                        rs.getString("candidateid"),
                        rs.getString("partyname"),
                        rs.getString("partyleader"),
                        rs.getString("sex"),
                        rs.getString("age"),
                        rs.getString("partyHQ"),
                        rs.getString("partysign"),
                        rs.getBytes("candidate_image"));
                candidate_list.add(candidate);
            }
        } catch (SQLException ex) {
        }
        return candidate_list;
    }

    @Override
    public Candidate getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Candidate getUserByUsernameAndPassword(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
