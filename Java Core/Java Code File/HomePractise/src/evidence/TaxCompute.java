package evidence;

import java.util.Scanner;

public class TaxCompute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount: ");
        double amount = sc.nextInt();
        System.out.println("Rate: ");
        double rate = sc.nextDouble();
        System.out.println("Year: ");
        double year = sc.nextDouble();
        double total = amount * Math.pow(1 + rate, year);
        //double inTotal = amount+total;
        System.out.println("Total: " + total);

    }
}
