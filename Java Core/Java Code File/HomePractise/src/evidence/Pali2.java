
package evidence;

import java.util.Scanner;


public class Pali2 {

    public static void main(String[] args) {
	isPali();
    }

    public static void isPali() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A String");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equalsIgnoreCase(rev)) {
            System.out.println(" Is ");

        } else {
            System.out.println(" Not");

        }

    }
}
