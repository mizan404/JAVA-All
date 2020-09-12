package Evidence;

public class BubbleSortTwoDimentation {

    public static void main(String[] args) {
        System.out.print("The Array sort are: ");
        int list[][] = {{12, 3, 8, 1}, {8, 3, 2, 44, 9, 21}, {10, 15, 7, 6, 20}};
        bubbleSort(list);
        print(list);
    }

    public static void bubbleSort(int[][] list) {
        for (int[] list1 : list) {
// Write like this --(int i =0; i<list.length; i++)
            boolean mizan = true;
            for (int j = 1; j < list1.length && mizan; j++) {
                mizan = false;
                for (int k = 0; k < list1.length - j; k++) {
                    if (list1[k] > list1[k + 1]) {
                        int temp = list1[k];
                        list1[k] = list1[k + 1];
                        list1[k + 1] = temp;
                        mizan = true;
                    }
                }
            }

        }

    }

    static void print(int[][] list) {
        for (int[] list1 : list) {
            // Write like this --(int i =0; i<list.length; i++)
            for (int j = 0; j < list1.length; j++) {
                System.out.print(list1[j] + " ");
            }
            System.out.print(",  ");
        }
    }
}
