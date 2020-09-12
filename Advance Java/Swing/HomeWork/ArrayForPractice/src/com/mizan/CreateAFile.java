/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohdm
 */
public class CreateAFile {

    public static void main(String[] args) {
        try {
            Formatter fm = new Formatter("G:\\IT Files\\Pratices Files\\ArrayForPractice\\src\\com\\mizan\\test2.txt");
            fm.format("%s %s %s", "1", "John", "Smith \r\n");
            fm.format("%s %s %s", "2", "Amy", "Brown");
            fm.close();
            System.out.println("Created");

        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
    }
}
