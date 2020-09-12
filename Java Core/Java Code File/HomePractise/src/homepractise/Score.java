/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepractise;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Score {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();
        if (score > 90) {
            System.out.println(score * 1.03);
        } else {
            System.out.println(score * 1.01);
        }
    }
}
