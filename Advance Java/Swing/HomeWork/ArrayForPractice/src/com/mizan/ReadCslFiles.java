package com.mizan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCslFiles {

    public static void main(String[] args) {
        String path = "G:\\IT Files\\Pratices Files\\ArrayForPractice\\src\\com\\mizan\\Sacramentorealestatetransactions.csv";
        String line = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            while ((line = reader.readLine()) != null) {

                String[] values = line.split(",");
                System.out.println("Street number: "+ values[0] +", City Name: "+ values[1]);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
