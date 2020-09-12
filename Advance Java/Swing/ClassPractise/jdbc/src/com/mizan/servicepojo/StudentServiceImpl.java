 package com.mizan.servicepojo;

import com.mizan.conn.DbConnection;
import com.mizan.pojo.Student;
import com.mizan.service.CommonService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements CommonService<Student> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void createTable() {
        String sql = "create table student(id int(11) primary key auto_increment,"
                + "name varchar(50) not null,"
                + "email varchar(50) not null,"
                + "gender varchar(50) not null,"
                + "round varchar(50) not null,"
                + "note varchar(500) not null)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::::Table Created:::::");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void save(Student t) {
        String sql = "insert into student(name, email, gender, round, note) value(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getGender());
            ps.setString(4, t.getRound());
            ps.setString(5, t.getNote());
            ps.executeUpdate();
            System.out.println(":::::Data Inserted :::::");

        } catch (Exception e) {
        }
    }

    @Override
    public void update(Student t) {
        String sql = "update student set name=?, email=?, gender=?, round=?, note=? where id=?";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getGender());
            ps.setString(4, t.getRound());
            ps.setString(5, t.getNote());
            ps.setInt(6, t.getId());
            ps.executeUpdate();
            System.out.println(":::::Data Updated :::::");

        } catch (Exception e) {
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from student where id=?";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println(":::::Data Deleted :::::");

        } catch (Exception e) {
        }
    }

    @Override
    public Student get(int id) {
        Student student = null;
        String sql = "select * from student where id=?";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
                        rs.getString("gender"), rs.getString("round"), rs.getString("note"));

            }
            ps.executeUpdate();
            System.out.println(":::::Data is getting   :::::");

        } catch (Exception e) {
        }
        return student;
    }

    @Override
    public List<Student> getList() {
        List<Student> students = new ArrayList<>();

        String sql = "select * from student";
        try {
            PreparedStatement ps = con.prepareCall(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
                        rs.getString("gender"), rs.getString("round"), rs.getString("note"));
                students.add(student);

            }
            

        } catch (Exception e) {
        }
        return students;
    }

}
