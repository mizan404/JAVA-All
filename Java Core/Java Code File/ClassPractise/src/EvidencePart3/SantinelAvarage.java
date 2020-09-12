/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePart3;

import java.util.Scanner;

/**
 *
 * @author Students
 */
public class SantinelAvarage {

    public static void main(String[] args) {
        getSum();

    }

    public static void getSum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        double count = 0;
        while (num != -1) {
            sum += num;
            count += num / num;
            num = input.nextInt();

        }
        System.out.println("Average is  " + sum / count);
    }
}
