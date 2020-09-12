package EvidencePart3;

import java.util.Scanner;

public class GradeSystem {

    public static void main(String[] args) {
        getGrade();

    }

    public static void getGrade() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Exam Mark ");
        double mark = input.nextDouble();
        if (mark >= 80) {
            System.out.print(" The Obtain Result is A+ ");
        } else if (mark >= 70) {

            System.out.print(" The Obtain Result is A ");
        } else if (mark >= 60) {

            System.out.print(" The Obtain Result is B+ ");
        } else if (mark >= 50) {

            System.out.print(" The Obtain Result is B ");
        } else if (mark >= 40) {

            System.out.print(" The Obtain Result is C ");
        } else if (mark >= 33) {

            System.out.print(" The Obtain Result is D ");
        } else {

            System.out.print(" The Obtain Result is F ");
        }

    }
}
