package EvidencePart3;

import java.util.Scanner;

public class SaltinelValue {

    public static void main(String[] args) {
        System.out.println("The sum until -1 is = " + getSum());

    }

    public static int getSum() {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int num = input.nextInt();
        while (num != -1) {
            sum += num;
            num = input.nextInt();

        }
        return sum;
       

    }
}
