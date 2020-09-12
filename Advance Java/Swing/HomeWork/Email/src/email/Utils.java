/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidenceidb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Utils {
    public static void writeTofile(String filename, Student s) {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("We have to make a new file");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            
                out.append(s.getName() + ", " + s.getEmail() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound()+"\n");
            
            out.close();
        } catch (IOException e) {
            System.out.println("Could not log!!");
        }
    }
        public static void displayStudentModelDataFromFile(String filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Buffered reader issue");
        }
    }

    
    
}
