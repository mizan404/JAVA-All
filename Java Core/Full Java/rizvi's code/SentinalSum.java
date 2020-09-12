
package evidence;

import java.util.Scanner;

public class SentinalSum {
    
    public static void main(String[] args) {
        System.out.println( getSum());
    }
    public static int getSum(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num!=-1){
           sum+=num;
           num=sc.nextInt();
        }
        return sum;
        
        
    }
}
