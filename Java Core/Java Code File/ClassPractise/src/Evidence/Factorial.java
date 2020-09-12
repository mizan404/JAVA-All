package Evidence;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("The factorial of 200 is "+ getFactorial(200));
    }

    public static int getFactorial(int num) {
        int factorial = 1;
        if (num < 2) {
            factorial = 1;
        } else {
            while (num >= 1) {
                factorial *= num;
                num--;
            }
        }
        return factorial;
    }
}
