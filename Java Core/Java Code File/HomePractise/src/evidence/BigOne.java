package evidence;

import java.util.Scanner;

public class BigOne {

    public static void main(String[] args) {
        System.out.println("The bigOne is: " + getBig());
    }

    public static int getBig() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers ");
        int num = sc.nextInt();
        int bigOne = num;
        while (num != -1) {
            num = sc.nextInt();
            if (bigOne < num) {
                bigOne = num;

            }

        }
        return bigOne;
    }
}
