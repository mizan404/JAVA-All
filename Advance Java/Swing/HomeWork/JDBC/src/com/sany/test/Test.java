
package com.sany.test;

import com.sany.conn.DbConnection;
import com.sany.pojo.Student;
import com.sany.service.CommonService;
import com.sany.serviceimp.StudentServiceImpl;
import java.sql.Connection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       // Connection con=DbConnection.getInstance();
        CommonService inService=new StudentServiceImpl();
        //inService.createTable();
        
        //save
       // Student s1 = new Student("Maria", "maria@gmail.com", "Female", "Round-43", "Ok");
       // inService.save(s1);
        //Student s2 = new Student("Swarna", "swarna@gmail.com", "Female", "Round-43", "Ok");
       // inService.save(s2);
       // Student s3 = new Student("Romana", "romana@gmail.com", "Female", "Round-43", "Ok");
       // inService.save(s3);
       
       //Student s4 = new Student(1, "Maria", "maria@gmail.com", "Female", "Round-43", "Ok...........");
       //inService.update(s4);
       //inService.delete(2);
      // Student student = (Student) inService.get(1);
       //System.out.println("Name: " + student.getName() + " Note: " + student.getNote());
        List<Student> list = inService.getList();
        for (Student s : list) {
            System.out.println("Name: " + s.getName() + " Note: " + s.getNote());
        } 
    }
 
}
