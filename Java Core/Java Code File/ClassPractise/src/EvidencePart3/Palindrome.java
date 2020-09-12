package EvidencePart3;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        isPalin();

    }

    public static void isPalin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = input.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Is a palindrome");

        } else {
            System.out.println("Not a palindrome");
        }

    }
}
