package EvidencePart2;

public class ArrayNew2DSort {

    public static void main(String[] args) {
        System.out.println("The Sorted Array are : ");
        int[][] m = {
            {9, 8, 7, 6, 5, 4, 3, 2, 1},
            {9, 6, 3, 8, 5, 2, 7, 4, 1},
            {7, 8, 9, 4, 5, 6, 3, 2, 1}
        };
        sortRow(m);
    }

    public static int sortRow(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {
                        int temp = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = temp;

                    }

                }

            }

        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
