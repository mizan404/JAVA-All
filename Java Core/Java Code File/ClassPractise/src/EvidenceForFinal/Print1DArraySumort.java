package EvidenceForFinal;
///////////////////// Need To Edit
public class Print1DArraySumort {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5}    
        };
        print2DArrayAndGetSum(arr);
    }

    public static void print2DArrayAndGetSum(int[][] twoD) {
        int sum = 0;
        for (int[] oneD : twoD) {
            for (int num : oneD) {
                System.out.println(num + "");

            }
            System.out.println();

        }
        System.out.println("Sum is " + sum);
    }

}
