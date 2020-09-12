
package javaidb;

public class ArraySort {
    
    static int arrayMy(int m[][]){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                for(int k=0;k<m[i].length-j-1;k++){
                    if(m[i][k]>m[i][k+1]){
                        int t=m[i][k];
                        m[i][k]=m[i][k+1];
                        m[i][k+1]=t;
                        
                    }
                }
                    
                
            }
            
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+"  ");
               
            }
        }
        
      return 0;  
    }
    
    public static void main(String[] args) {
        int m[][]={
            {1,3,5},
        {6,8,7}
    };
        
        arrayMy(m);
    }
    
}
