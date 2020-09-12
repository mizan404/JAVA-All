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
public class Test3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0, count;
        for (count = 0; count < 5; count++) {
            number = input.nextInt();
            sum += number;
        }
        System.out.println("sum is " + sum);
        System.out.println("count is " + count);
    }
}
