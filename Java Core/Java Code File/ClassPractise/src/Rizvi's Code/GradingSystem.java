package evidence;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        getGrade();
    }

    public static void getGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  exam mark");
        double mark = sc.nextDouble();
        if (mark >= 80) {
            System.out.println(" Result is A+ grade");
        } else if (mark >= 70) {
            System.out.println(" Result is A grade");
        } else if (mark >= 60) {
            System.out.println(" Result is B+ grade");
        } else if (mark >= 50) {
            System.out.println(" Result is B grade");
        } else if (mark >= 40) {
            System.out.println(" Result is C grade");
        } else if (mark >= 33) {
            System.out.println(" Result is D grade");
        } else {
            System.out.println("Fail");
        }

    }
}
