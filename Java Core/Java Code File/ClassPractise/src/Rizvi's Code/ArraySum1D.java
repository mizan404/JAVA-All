
package javaidb;

public class ArraySum1D {
    public static void main(String[] args) {
        int [] m={2,3,8,9};
        sumOne(m);
    }
    public static void sumOne(int[]oneD){
        int sum=0;
        for(int num:oneD){
            sum+=num;
            System.out.println(num);
            
        }
        System.out.print(sum);
        
    }
    
}
