package version2;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("" + getsum());
    }

    public static int getsum() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("num");
        int num = sc.nextInt();
        while (num != -1) {
            sum += num;
            num = sc.nextInt();
        }
        return sum;
    }
}
