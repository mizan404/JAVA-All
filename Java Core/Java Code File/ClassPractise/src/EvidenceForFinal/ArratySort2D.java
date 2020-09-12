package EvidenceForFinal;

public class ArratySort2D {

    // driver code 
    public static void main(String args[]) {
        int m[][] = {
        {9, 8, 7, 1},
        {7, 3, 0, 2},
        {9, 5, 3, 2},
        {6, 3, 1, 2}};
        sortRowWise(m);
    }

    static int sortRowWise(int m[][]) {
        // loop for rows of matrix
        for (int[] m1 : m) {
            // loop for column of matrix
            for (int j = 0; j < m1.length; j++) {
                // loop for comparison and swapping
                for (int k = 0; k < m1.length - j - 1; k++) {
                    if (m1[k] > m1[k + 1]) {
                        // swapping of elements
                        int temp = m1[k];
                        m1[k] = m1[k + 1];
                        m1[k + 1] = temp;
                    }
                }
            }
        }

        // printing the sorted matrix
        for (int[] m1 : m) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print(m1[j] + " ");
            }
            System.out.println();
        }

        return 0;
    }

}
