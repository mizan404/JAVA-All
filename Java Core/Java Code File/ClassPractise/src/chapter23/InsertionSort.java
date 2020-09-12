package chapter23;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4};
        for (int i : InsertionSort(arr)) {
            System.out.print(i + " ");

        }
    }

    public static int[] InsertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            System.out.println(" Current: " + currentElement);
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
                System.out.println(k + 1 + " No index " + list[k]);

            }
            list[k + 1] = currentElement;
            System.out.println(k + 1 + " No Index " + currentElement);

        }

        return list;
    }
}
