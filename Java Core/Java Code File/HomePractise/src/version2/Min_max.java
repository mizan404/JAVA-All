package version2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Min_max {

    public static void main(String[] args) {

        // Creates an array of integer numbers in it.
        System.out.println("Enter Up To 3 Numbers");
        Scanner sc = new Scanner(System.in);
        Integer[] numbers = new Integer[3];

        // Reading array elements dynamically using scanner class
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("enter numbers:");
            numbers[i] = sc.nextInt();
        }

        // use the Collections.min() and Collections.max() methods.
        // But as this method requires a list type of data we need
        // to convert the array to list first.
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));

        // we get the minimum and the maximum value from the array.
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}