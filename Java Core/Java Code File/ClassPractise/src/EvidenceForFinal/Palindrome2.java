package EvidenceForFinal;

import java.util.Scanner;

public class Palindrome2 {

    public static void main(String[] args) {
        isPalindrome();
    }

    public static void isPalindrome() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println(" Not  Palindrome");

        }

    }
}
