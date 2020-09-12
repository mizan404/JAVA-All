package evidence;

public class ArraySort {

    public static void main(String[] args) {
        int[][] m
                = {
                    {700, 900, 800, 1000, 600},
                    {90, 60, 100, 70, 80},
                    {6, 7, 8, 9, 10}
                };
        System.out.println("The Sorted Array Are ");
        SortedArray(m);
    }

    public static int SortedArray(int[][] m) {
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
