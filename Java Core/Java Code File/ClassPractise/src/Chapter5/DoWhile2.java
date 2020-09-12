/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DoWhile2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter an integer "
                + "(the input ends if it is 0)");
        int number = input.nextInt();
        while (number != 0) {
            sum += number;
            System.out.println("Enter an integer "
                    + "(the input ends if it is 0)");
            number = input.nextInt();
        }
    }
}
