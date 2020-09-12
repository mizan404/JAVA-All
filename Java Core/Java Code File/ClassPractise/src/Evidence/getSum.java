package Evidence;

import java.util.Scanner;

public class getSum {

    public static void main(String[] args) {
        System.out.println("Sum is " + getSum());
    }

    public static int getSum() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        while (num != -1) {
            sum += num;
            num = sc.nextInt();

        }
        return sum;
    }
}
