package com.mizan.sololearn;

class CallByValue {
    
    void change(int i) {
        i = 20;        
    }
    
}

public class CallByValueTest {
    
    public static void main(String[] args) {
        CallByValue cb = new CallByValue();
        int x = 10;        
        System.out.println("x before call: " + x);
        cb.change(x);
        System.out.println("x after call: " + x);
    }
    
}
