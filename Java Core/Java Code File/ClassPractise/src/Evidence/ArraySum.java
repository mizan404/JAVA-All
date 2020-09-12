package Evidence;

public class ArraySum {

    public static void main(String[] args) {
        getArraySum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public static void getArraySum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];

        }
        System.out.println();
        System.out.println("Sum is " + sum);
    }
}
