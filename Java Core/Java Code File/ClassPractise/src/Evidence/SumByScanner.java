package Evidence;

import java.util.Scanner;

public class SumByScanner {

    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number for Sum: ");
        int num = s.nextInt();
        while (num != 11) {
            sum += num;
            num = s.nextInt();

        }
        System.out.println("The sum is : " + sum);
    }
}
