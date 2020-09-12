/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohdm
 */
public class Utils {
    public static void writeTofile(String filename, Student s){
    File deshFile = new File(filename+".txt"); 
        try {
            if(deshFile.exists()==false){
                System.out.println("We had to make");
                deshFile.createNewFile(); 
            }
            PrintWriter out = new PrintWriter(new FileWriter(deshFile, true)); 
            out.append(s.getName()+", "+ s.getAge()+", "+s.getContact()+", "+s.getGender()+", "+s.getCourse()+", "+s.getRemark()+", "+s.getLocation()+"\n");
            out.close();
        } catch (Exception e) {
            System.out.println("Could not log!!");
        }
    
    }
    public static void displayData(String filename, DefaultTableModel model){
        String line; 
        BufferedReader reader;
        try {
            reader= new BufferedReader(new FileReader(filename+".txt")); 
            while((line=reader.readLine())!=null){
            model.addRow(line.split(", "));
            
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffered Issue!!");
        }
    
    
    }
}
