package evidencetwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Utils {

    public static void writeToFile(String filename, Student s) {
        File deshFile = new File(filename + ".txt");
        try {
            if (deshFile.exists() == false) {
                System.out.println("We had to make a new file");
                deshFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(deshFile, true));
            out.append(s.getSerial() + ", " + s.getSerial() + ", " + s.getName() + ", " + s.getEmail() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound() + ", " + "\n");
            out.close();
        } catch (IOException ex) {
            System.out.println("COUND NOT LOG!");
        }
    }

    public static void displayFromFile(String filename,
            DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ", "));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Buffered Reader issue");
        }

    }
}
