package EvidencePart2;

public class Array2DSort {

    public static void main(String[] args) {
        int m[][] = {
            {7, 2, 9, 1, 8, 3, 4},
            {6, 1, 3, 9, 8, 4, 2},
            {9, 6, 3, 1, 2, 5, 8}
        };
        System.out.println("The Sorted Array are: ");
        sortRow(m);
    }

    static int sortRow(int m[][]) {
        for (int[] m1 : m) {
            for (int j = 0; j < m1.length; j++) {
                for (int k = 0; k < m1.length - j - 1; k++) {
                    if (m1[k] > m1[k + 1]) {
                        int temp = m1[k];
                        m1[k] = m1[k + 1];
                        m1[k + 1] = temp;
                    }
                }
            }
        }
        for (int[] m1 : m) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print(m1[j] + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
