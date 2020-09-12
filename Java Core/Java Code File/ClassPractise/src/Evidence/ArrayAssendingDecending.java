package Evidence;

import java.util.Arrays;

public class ArrayAssendingDecending {
    public static void main(String[] args) {
        getArrayAandD();
    }
    public static void getArrayAandD(int... arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println("");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + "");
        }
    }
}
