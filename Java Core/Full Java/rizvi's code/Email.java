
package javaidb;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
     mail();   
    }
    static String mail(){
        System.out.print("Enter your mail:");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int apt=str.indexOf("@");
        int dot=str.indexOf(".");
        if(apt>0 && dot<str.length()-1 && apt< dot-1){
            System.out.print("Valid input");
        }else{
             System.out.print("Invalid input");
        }
        return null;
    }
    
}
