package com.mizan.serviceimpl;

import com.mizan.connection.DbConnection;
import com.mizan.pojo.Category;
import com.mizan.pojo.Product;
import com.mizan.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductServiceImpl extends CommonServiceAdapter<Product> {
    
    static Connection con = DbConnection.getInstance();
    
    @Override
    public void save(Product t) {
        String sql = "insert into product(name, code, photo_url, cat_id, status, note) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getCode());
            ps.setString(3, t.getPhotoUrl());
            ps.setInt(4, t.getCategory().getId());
            ps.setBoolean(5, t.isStatus());
            ps.setString(6, t.getNote());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void update(Product t) {
        String sql = "update product set name=?, code=?,photo_url=?,cat_id=?, status=?,note=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getCode());
            ps.setString(3, t.getPhotoUrl());
            ps.setInt(4, t.getCategory().getId());
            ps.setBoolean(5, t.isStatus());
            ps.setString(6, t.getNote());
            ps.setInt(7, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void delete(int id) {
        String sql = "delete from product where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Data Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Product get(int id) {
        Product product = null;
        String sql = "select * from product where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
                product = new Product(rs.getInt("id"), rs.getString("name"), rs.getString("code"),
                        rs.getString("photo_url"), new Category(rs.getInt("cat_id")), rs.getBoolean("status"), rs.getString("note"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }
    
    @Override
    public Product getProductByIdAndCategory(String product_name, int cat_id) {
        Product product = null;
        String sql = " select * from product where name=? and cat_id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, product_name);
            ps.setInt(2, cat_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
                product = new Product(rs.getInt("id"), rs.getString("name"), rs.getString("code"),
                        rs.getString("photo_url"), new Category(rs.getInt("cat_id")), rs.getBoolean("status"), rs.getString("note"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }
    
    @Override
    public List<Product> getList() {
        List<Product> products = new ArrayList<>();
        String sql = "select * from product where status = true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt("id"), rs.getString("name"), rs.getString("code"),
                        rs.getString("photo_url"), new Category(rs.getInt("cat_id")), rs.getBoolean("status"), rs.getString("note"));
                products.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return products;
    }
    
    @Override
    public List<Product> getListBycategory(int id) {
        List<Product> products = new ArrayList<>();
        String sql = "select * from product where cat_id=? and status = true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt("id"), rs.getString("name"), rs.getString("code"),
                        rs.getString("photo_url"), new Category(rs.getInt("cat_id")), rs.getBoolean("status"), rs.getString("note"));
                products.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return products;
    }
    
    @Override
    public void createTable() {
        String sql = "create table product(id int(5) primary key auto_increment,"
                + "name varchar(250) not null unique,"
                + "code varchar(50) not null unique,"
                + "photo_url varchar(100),"
                + "cat_id int(5),"
                + "status BOOLEAN,"
                + "note varchar(200),"
                + "FOREIGN KEY(cat_id) REFERENCES category(id))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
