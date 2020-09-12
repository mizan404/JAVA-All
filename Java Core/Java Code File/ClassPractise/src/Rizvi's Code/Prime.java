
package primerange;


public class Prime {
    public static void main(String[]args){
        getPrime();
    }
   public static void getPrime(){
    int i=0;
    int num=0;
    
    String primeNumbers="";
    
    for(i=1;i<=300;i++){
        int c=0;
           for(num=i;num>=1;num--){
               if(i%num==0){
                   c=c+1;
               }
           }
        
        if(c==2){
        
        primeNumbers=primeNumbers+i+"  ";
    }
       
} 
    
 System.out.println("Prime numbers from 1 to 100 are:"+" "+primeNumbers);   
 
}
}
