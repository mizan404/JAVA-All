/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidence;

/**
 *
 * @author Students
 */
import java.util.Scanner;
public class PrimeTest {
    public static void main(String[] args) {
        priim();
    }
    public static void priim() {
        System.out.print("Enter range:"+"");
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        String primx="";
        for(int i=1;i<=range;i++){
            int c=0;
            for(int num=i;num>=1;num--){
                if(i%num==0){
                    c=c+1;
                }
            }
            if(c==2){
                primx=primx+i+" ";
            }
        }
        System.out.print("prime series:"+" "+primx);
        
    }
    
}
