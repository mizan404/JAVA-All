package com.sany.serviceimp;

import com.mysql.cj.protocol.Resultset;
import com.sany.conn.DbConnection;
import com.sany.pojo.Student;
import com.sany.service.CommonService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Collections.list;

public class StudentServiceImpl implements CommonService<Student> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void save(Student t) {
        String sql = "insert into student(name, email, gender, round, note) values(?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getGender());
            ps.setString(4, t.getRound());
            ps.setString(5, t.getNote());
            ps.executeUpdate();
            System.out.println(":::Data inserted Successfully:::");

        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Student t) {
        String sql = "update student set name=?, email=?, gender=?, round=?, note=? where id=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getGender());
            ps.setString(4, t.getRound());
            ps.setString(5, t.getNote());
            ps.setInt(6, t.getId());
            ps.executeUpdate();
            System.out.println(":::Data Updated Successfully:::");

        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from student  where id=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println(":::Data Delete Successfully:::");

        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Student get(int id) {
        Student student = null;
        String sql = "select * from student where id=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
                        rs.getString("gender"), rs.getString("round"), rs.getString("note"));
            }

            

        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }

    @Override
    public List<Student> getList() {
        List<Student> students = new ArrayList<>();
        String sql = "select * from student";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
                        rs.getString("gender"), rs.getString("round"), rs.getString("note"));
                students.add(student);
            }
           

        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    @Override
    public void createTable() {
        String sql = "create table student(id int(11) primary key auto_increment,name varchar(50) not null,email varchar(50) not null,gender varchar(50) not null,round varchar(50) not null,note varchar(50) not null)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::Table Created:::");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
