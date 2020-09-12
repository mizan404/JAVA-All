package com.mizan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DublicateElements {

    public static void main(String[] args) {
        //    Way 1:    Brute Force Method 
        System.out.println("Dublicate Element are: ");
        // it works for 2 dublicate number's but not more...........
        int[] a = {4, 2, 3, 4, 1, 5, 6, 7, 8, 9, 8, 9, 7, 8, 5,5,5};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && (i != j)) {
                    System.out.print(a[j] + " ");
                }
            }
        }

        System.out.println("-------------------------------------");
        System.out.print(" ");
        // Way 2:   Set Interface
        // it works for 2 dublicate number's but not more...........
        Set<Integer> set = new HashSet<>();

        for (int no : a) {
            if (set.add(no) == false) {
                System.out.print(no + " ");
            }
        }

        // Way 3: Using HashTable
        System.out.println("-------------------------------------");
        System.out.print(" ");
        
        Map<Integer, Integer> hm = new HashMap<>();
        for (int no : a) {
            Integer count = hm.get(no);
            if (count == null) {
                hm.put(no, 1);
            } else {
                count = count + 1;
                hm.put(no, count);
            }
        }
        Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
        for (Map.Entry<Integer, Integer> me : es) {
            if (me.getValue() > 1) {
                System.out.print(me.getKey() + " ");
            }
        }

    }
}
