package Chapter5;

public class Test6 {

    public static void main(String[] args) {
        /*float sum = 0;

        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("sum " + sum);*/
        ///////////////////////////////////////////////////////
        /* double currentValue = 1.0;
        for (int count = 0; count < 100; count++) {
            sum += currentValue;
            currentValue -= 0.01;
            System.out.println(count);
        }
        System.out.println(sum + " sum"); */
        ///////////////////////////////////////////////
        // double count = 0;
        /*  double sum = 0;
        double currentValue1 = 0.01;
        for (int count = 0; count < 100; count++) {
            sum += currentValue1;
            currentValue1 += 0.01;
            System.out.println(count);
        }
        System.out.println(sum); */

        // Initialize sum
        /*double sum = 0;
// Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (double i = 0.01; i <= 1.0; i = i + 0.01) {
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum);*/
 /* int n1 = 25;
        int n2 = 10;
        int gcd = 1;// Initial gcd is 1
        int k = 2;// Possible gcd
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k; // Update gcd

                k++; // Next possible gcd
                System.out.println(" 2:  " + gcd);
            } 

        }*/
        int balance = 10;
        while (true) {
            if (balance < 9) {
                continue;
            }
            balance = balance - 9;
            System.out.println("Balance is " + balance);
        }
System.out.println("Balance is " + balance);
    }
}
