package Chapter12;

import java.util.Scanner;

public class QuotientWithException {

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Division cannot be zero");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = quotient(number1, number2);
    }

    
        try{
        int result = quotient(number1, number2);
        System.out.println("number1 + " / " + number2 + " is " + result");
} 
        
}
