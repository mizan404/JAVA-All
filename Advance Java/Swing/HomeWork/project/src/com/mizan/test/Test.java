package com.mizan.test;

import com.mizan.connection.DbConnection;
import com.mizan.service.CommonService;
import com.mizan.serviceimpl.CategoryServiceImpl;
import com.mizan.serviceimpl.ProductServiceImpl;
import com.mizan.serviceimpl.PurchaseServiceImpl;
import com.mizan.serviceimpl.SalesServiceImpl;
import com.mizan.serviceimpl.StudentSericeImpl;
import com.mizan.serviceimpl.SummaryServiceImpl;
import com.mizan.serviceimpl.UserServiceImpl;
import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        Connection con=DbConnection.getInstance();
CommonService inService = new SummaryServiceImpl();
inService.createTable();
        /////////save
//        Student s1 = new Student("Maria", "maria@gmail.com", "Female", "Round-43", "Ok");
//        inService.save(s1);
//        Student s2 = new Student("Swarna", "swarna@gmail.com", "Female", "Round-43", "Ok");
//        inService.save(s2);
//       Student s3 = new Student("Romana", "romana@gmail.com", "Female", "Round-43", "Ok");
//       inService.save(s3);

//        Student s4 = new Student(1, "Maria", "maria@gmail.com", "Female", "Round-43", "Ok...........");
//        inService.update(s4);
        // inService.delete(3);
//        Student student = (Student) inService.get(1);
//        System.out.println("Name: " + student.getName() + " Note: " + student.getNote());
//        List<Student> list = inService.getList();
//        for (Student s : list) {
//            System.out.println("Name: " + s.getName() + " Note: " + s.getNote());
//        }
//        inService.createTable();

    }

}
