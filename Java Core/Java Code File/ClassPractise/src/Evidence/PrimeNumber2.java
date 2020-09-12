
package Evidence;

import java.util.Scanner;

public class PrimeNumber2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Postive Number ");
        int num = input.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}
