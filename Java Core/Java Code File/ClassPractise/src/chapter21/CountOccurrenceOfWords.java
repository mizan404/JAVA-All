/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Students
 */
public class CountOccurrenceOfWords {

    public static void main(String[] args) {
// Set text in a string
        String text = "Good morning. Have a good class. "
                + "Have a good visit. Have fun!";

// Create a TreeMap to hold words as key and count as value
        Map<String, Integer> map = new TreeMap<>();

        String[] words = text.split("[ \\s+\\p{p}]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();

            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        // Get all entries into a set
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Get key and value from each entry
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getValue() + "\t" + entry.getKey());
        }

    }
}
