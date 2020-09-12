
package javaidb;
import java.util.*;

public class Fabonacci {
    
    public static void main(String[] args) {
     fab();   
    }
    static void fab(){
        System.out.print("Enter an integer:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int a,b,v;
        for(a=0,b=1,v=0;v<=num;a=b,b=v,v=a+b){
            
            System.out.println(v);
        }
        
    }
    
}
