package evidence;

import java.util.Scanner;

public class Pali3 {

    public static void main(String[] args) {
        isPali4();
    }

    public static void isPali4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A String : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equalsIgnoreCase(rev)) {
            System.out.println(" Is a palindrome");

        } else {
            System.out.println(" Not ");
        }
    }
}
