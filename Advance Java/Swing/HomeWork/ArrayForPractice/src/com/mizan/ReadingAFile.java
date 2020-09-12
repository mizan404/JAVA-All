/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import com.sun.org.apache.bcel.internal.generic.F2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohdm
 */
public class ReadingAFile {

    public static void main(String[] args) {
        try {
            File file = new File("G:\\IT Files\\Pratices Files\\ArrayForPractice\\src\\com\\mizan\\test2.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                System.out.println(scan.next() + " ");
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            System.out.print("Error");
        }
    }

}
