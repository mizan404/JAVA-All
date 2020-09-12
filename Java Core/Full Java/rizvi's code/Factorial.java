
package javaidb;

import java.math.BigInteger;
public class Factorial {
    public static void main(String[] args) {
    factor();    
    }
    static BigInteger factor(){
       int x=4;
       BigInteger fact=BigInteger.ONE;
       for(int i=2;i<=x;i++){
           fact=fact.multiply(BigInteger.valueOf(i));
       }
       System.out.println(fact);
       return null; 
    }
    
    
}
