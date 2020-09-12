package com.mizan.servicepojo;

import com.mizan.connection.DbConnection;
import com.mizan.pojo.Catagory;
import com.mizan.service.CommonService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CatagoryServiceImpl implements CommonService<Catagory> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void createTable() {
        String sql = "create table catagory(id int(11) primary key auto_increment,"
                + "name varchar(50) not null,"
                + "note varchar(50) not null)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::::::::Table Created::::::::");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Catagory t) {
        String sql = "insert into catagory(name, note) value(?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getNote());
            ps.executeUpdate();
            System.out.println(":::::::::Table Inserted::::::::");
        } catch (Exception e) {

        }
    }

    @Override
    public void update(Catagory t) {

        String sql = "update catagory set name=?, note=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getNote());
            ps.setInt(3, t.getId());
            ps.executeUpdate();
            System.out.println(":::::::::Table Updated::::::::");
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(int id) {
String sql = "delete from catagory  where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println(":::::::::Table Deleted::::::::");
        } catch (Exception e) {

        }
    }

    @Override
    public Catagory get(int id) {
        Catagory catagory = null; 
        
String sql = "select * from catagory  where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            catagory = new Catagory(rs.getInt("id"), rs.getString("name"), rs.getString("note")); 
            }
                    
            ps.executeUpdate();
            System.out.println(":::::::::Data is Getting Ready::::::::");
        } catch (Exception e) {

        }
        return catagory; 
    }

    @Override
    public List<Catagory> getList() {
  List<Catagory> catagorys = new ArrayList<>();
        
String sql = "select * from catagory";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
             Catagory catagory = new Catagory(rs.getInt("id"), rs.getString("name"), rs.getString("note")); 
             catagorys.add(catagory); 
            }
                    
        } catch (Exception e) {

        }
        return catagorys; 
    }

}
