package version2;

public class SortedArray {

    public static void main(String[] args) {
        int[][] m = {
            {9, 6, 3, 8, 5},
            {9, 8, 7, 6, 5},
            {8, 5, 2, 6, 3}
        };
        sortArray(m);
    }

    public static int sortArray(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (m[i][k] < m[i][k + 1]) {
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
