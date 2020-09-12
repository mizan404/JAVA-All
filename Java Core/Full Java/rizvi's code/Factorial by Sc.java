
package evidence;
import java.util.Scanner;
import java.math.BigInteger;
public class Factorial {
    
    public static void main(String[]args){
        facto();
        
    }
    public static BigInteger facto(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer number:");
        int num=sc.nextInt();
        BigInteger big= BigInteger.ONE;
        for(int i=num;i>0;i--){
        big =big.multiply(BigInteger.valueOf(i));
        
        
         
       
        
        }
        System.out.print(big);
         return null;
    }
    
}
