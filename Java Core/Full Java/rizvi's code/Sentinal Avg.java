package complete;
import static java.time.Clock.system;
import java.util.*;
public class Sentinal {
   public static void main(String[] args) {
        
        getSum();
    }
    public static void getSum(){
      int sum =0;
      double avg =0;
      
      Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Number");
        int num =sc.nextInt();
        while (num!=-1){
             sum+=num;
            avg+=1;
            num=sc.nextInt();
           
           
        
        
    }
       System.out.println("Avg:"+""+sum/avg);
        
    }
}
   

