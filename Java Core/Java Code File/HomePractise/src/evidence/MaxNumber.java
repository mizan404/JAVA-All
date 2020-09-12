package evidence;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        max();
    }

    public static void max() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Five Numbers: ");
        System.out.println("Enter First Number For a: ");
        int a = input.nextInt();
        System.out.println("Enter Second Number For b: ");
        int b = input.nextInt();
        System.out.println("Enter Third Number For c: ");
        int c = input.nextInt();
        System.out.println("Enter Fourth Number For d: ");
        int d = input.nextInt();
        System.out.println("Enter Fifth Number For e: ");
        int e = input.nextInt();
        if ((a > b) && (a > c) && (a > d) && (a > e)) {
            System.out.println("A is the Max Number: " + a);
        } else if ((b > a) && (b > c) && (b > d) && (b > e)) {
            System.out.println("B is the Max Number: " + b);

        } else if ((c > a) && (c > b) && (c > d) && (c > e)) {
            System.out.println("C is the Max Number: " + c);

        } else if ((d > a) && (d > b) && (d > c) && (d > e)) {
            System.out.println("D is the Max Number: " + d);

        } else {
            System.out.println("E is the Max Number: " + e);
        }

    }
}
