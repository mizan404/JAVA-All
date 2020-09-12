
package javaidb;


public class ArraySum2D {
    public static void main(String[] args) {
        int m[][]={
            {1,2,3},{4,5,6}
        };
        arraySum(m);
    }
    public static void arraySum(int[][] twoD){
        int sum=0;
        for(int [] oneD:twoD){
            for(int num :oneD){
                System.out.println(num);
                sum+=num;
            }
            System.out.println();
        }
        System.out.print(sum);
    }
    
}
