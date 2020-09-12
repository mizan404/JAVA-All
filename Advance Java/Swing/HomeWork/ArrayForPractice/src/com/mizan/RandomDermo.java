/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.Scanner;

/**
 *
 * @author mohdm
 */
public class RandomDermo {

    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("What is " + number1 + " - " + number2 + " ? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (number1 - number2 == answer) {
            System.out.println("You are Correct");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " - " + number2 + " Should be " + (number1 - number2));
        }
    }

}
