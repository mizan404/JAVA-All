


ClassPractise;

public class Test2 {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5}
        };
        print2DArraySum(arr);
    }

    public static void print2DArraySum(int[][] twoD) {
        int sum = 0;
        for (int[] oneD : twoD) {
            for (int num : oneD) {
                System.out.println(num + "");
                sum += num;
            }
            System.out.println();

        }
        System.out.println("Sum is " + sum);
    }
}
