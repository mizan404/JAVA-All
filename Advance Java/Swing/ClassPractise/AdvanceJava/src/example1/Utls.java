package example1;

import java.io.BufferedReader;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Utls {

    public static void writeTofile(String filename, Student s){
        File deshFile = new File(filename + ".txt");
        try {
            if (deshFile.exists() == false) {
                System.out.println("We had to make a new file");
                deshFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(deshFile, true));
            out.append(s.getSerial() + ", " + s.getName() + ", " + s.getEmail() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound() + "\n");
            out.close();
        } catch (IOException e) {
            System.out.println("COULD NOT LOG!");
        }

    }

    public static void displayStudentdataFromFile(String filename,
            DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));//this has a comma and a space 
            }
            reader.close();

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Buffered Reader issue.");
        }

    }
}
