/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pali {

    public static void main(String[] args) {
        isPali();
    }

    public static void isPali() {
        Scanner sc = new Scanner(System.in);
        System.out.println("write ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equalsIgnoreCase(rev)) {
            System.out.println(" Pali");

        } else {
            System.out.println(" Not pali");

        }

    }
}
