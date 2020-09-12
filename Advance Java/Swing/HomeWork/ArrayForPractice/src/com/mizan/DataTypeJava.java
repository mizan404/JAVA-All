package com.mizan;

import java.util.Scanner;

public class DataTypeJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            String s = sc.next();
            if(s.equals("0") || s.equals("1")){
                System.out.println(s + " can be fitted in:\n* boolean\n* byte\n* short\n* int\n* long");
                continue;
            }
            try{
                byte temp = Byte.parseByte(s);
                System.out.println(temp + " can be fitted in:\n* byte\n* short\n* int\n* long");
                continue;
            }catch(Exception e){
                
            }
            try{
                short temp = Short.parseShort(s);
                System.out.println(temp + " can be fitted in:\n* short\n* int\n* long");
                continue;
            }catch(Exception e){
                
            }
            try{
                int temp = Integer.parseInt(s);
                System.out.println(temp + " can be fitted in:\n* int\n* long");
                continue;
            }catch(Exception e){
                
            }
            try{
                long temp = Long.parseLong(s);
                System.out.println(temp + " can be fitted in:\n* long");
                continue;
            }catch(Exception e){
                
            }
            System.out.println(s + " can't be fitted anywhere.");
        }
    }

}
