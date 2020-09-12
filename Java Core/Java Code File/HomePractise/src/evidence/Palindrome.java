package evidence;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        isPalindrome();

    }

    public static void isPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A String");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equalsIgnoreCase(rev)) {
            System.out.println(" Is a palindrome");
        } else {
            System.out.println(" Not a palindrome");
        }

    }
}
