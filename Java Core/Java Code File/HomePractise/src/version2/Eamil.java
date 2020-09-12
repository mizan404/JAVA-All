package version2;

import java.util.Scanner;

public class Eamil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("email");
        String email = sc.nextLine();
        int one = email.indexOf("@");
        int two = email.indexOf(".");
        if (one > 0 && two < email.length() - 1 && one < two - 1) {
            System.out.println("Valid");

        } else {
            System.out.println("Not ");
        }
    }
}
