
package javaidb;
import java.util.*;
public class Palindome {
    public static void main(String[] args) {
        checkPalindome();
    }
    static void checkPalindome(){
        System.out.print("Enter a String:");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder(str); 
        sb.reverse();
        String rev=sb.toString();
        if(str.equalsIgnoreCase(rev)){
          System.out.print("It is Palindome");
        }else{
          System.out.print("It is not  Palindome");  
        }
        
    }
    
}
