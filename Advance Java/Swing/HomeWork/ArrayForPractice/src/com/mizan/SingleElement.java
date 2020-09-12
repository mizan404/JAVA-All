package com.mizan;

public class SingleElement {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 1, 2, 3, 4, 6, 6, 5};
    
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            res = res ^ a[i];

        }
        System.out.println("Single Element is : " + res);

        System.out.println("------------------------------");

        
    }

}
