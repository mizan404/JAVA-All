/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.serviceimpl;

import com.mizan.connection.DBConnection;
import com.mizan.pojo.Admin;
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
public class AdminServiceImple implements CommonService<Admin> {

    static Connection connect = DBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table admin(id int(2) primary key not null,"
                + "username varchar(30) primary key not null,"
                + "password varchar(50) not null)";

        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImple.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void save(Admin t) {
        String sql = "insert into admin (id, username, password)values(?,?,?)";

        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setInt(1, t.getId());
            ps.setString(2, t.getName());
            ps.setString(3, t.getPassword());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImple.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Admin t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        String sql = "delete from admin";

        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImple.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Admin get(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Admin getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Admin> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Admin getUserByUsernameAndPassword(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        String sql = "delete from admin where id=?";

        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImple.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
