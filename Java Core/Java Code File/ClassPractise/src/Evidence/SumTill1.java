package Evidence;

import java.util.Scanner;

public class SumTill1 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        while (num != -1) {
            sum += num;
            num = sc.nextInt();

        }
        System.out.println("Sum is  " + sum);
    }
}
