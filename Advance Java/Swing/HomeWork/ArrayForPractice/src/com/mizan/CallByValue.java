package com.mizan;

public class CallByValue {

    static void increase(int p) {
        p = p + 1;
    }

    public static void main(String[] args) {
        int a = 6;
        increase(a);
        System.out.println("" + a);
    }
}
