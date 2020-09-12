
package evidence;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Amount");
        double amount =s.nextDouble();
        System.out.println("Enter a rate");
        
        double rate=s.nextDouble();
        System.out.println("Enter a Year");
        double year=s.nextDouble();
        double total=amount*Math.pow(1+rate, year);
        System.out.println("Total amount"+total);
    }
}
