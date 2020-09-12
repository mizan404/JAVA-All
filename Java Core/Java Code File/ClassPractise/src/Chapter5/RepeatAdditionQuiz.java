package Chapter5;

import java.util.Scanner;

public class RepeatAdditionQuiz {

    public static void main(String[] args) {
        int number1 = 10 + (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.println("What is the number It is?     " + number1 + " + " + number2);
        int answer = input.nextInt();
        while (number1 + number2 != answer) {
            System.out.println("Wrong answer. Try again");
            answer = input.nextInt();

        }
        System.out.println("You got it ");
        System.out.println("What is the number It is?   "
                + number2 + " - " + number1);
        int answer1 = input.nextInt();
        while (number2 - number1 != answer1) {
            System.out.println("Wrong answer. Try again");
            answer1 = input.nextInt();

        }
        System.out.println("You got it ");

        System.out.println("What is the number It is?      " + number2 + " * " + number1);
        int answer2 = input.nextInt();
        while (number1 * number2 != answer2) {
            System.out.println("Wrong answer. Try again");
            answer2 = input.nextInt();

        }
        System.out.println("You got it ");
    }
}
