/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.serviceimpl;

import com.mizan.connection.DBConnection;
import com.mizan.pojo.Winner;
import com.mizan.service.CommonService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohdm
 */
public class ResultServiceImpl implements CommonService<Winner> {

    static Connection connect = DBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table result (id varchar(11) primary key not null,"
                + "partyname varchar(50) not null,"
                + "counting varchar(50) not null)";

        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ResultServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Winner t) {

        String sql = "insert into result(id, partyname, counting) value(?,?,?)";

        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setInt(1, t.getId());
            ps.setString(1, t.getPartyname());
            ps.setInt(1, t.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ResultServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Winner t) {
        String sql = "update result set id=?, partyname, counting=? value(?,?,?)";

        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setInt(1, t.getId());
            ps.setString(1, t.getPartyname());
            ps.setInt(1, t.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ResultServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        String sql = "delete from result where id=?";

        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setInt(1, id);

            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ResultServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete() {
        String sql = "delete from result";

        try {
            PreparedStatement ps = connect.prepareCall(sql);

            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ResultServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Winner get(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Winner getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Winner> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Winner getUserByUsernameAndPassword(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
