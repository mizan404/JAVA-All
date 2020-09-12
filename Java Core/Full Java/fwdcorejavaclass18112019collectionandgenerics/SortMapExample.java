/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
 
public class SortMapExample{
 
   public static void main(String[] args) {
 
	System.out.println("Unsort and Unordered Map......");
	Map<String,String> unsortMap = new HashMap();
	unsortMap.put("1", "1");
	unsortMap.put("2", "A");
	unsortMap.put("3", "2");
	unsortMap.put("4", "B");
	unsortMap.put("5", "C");
	unsortMap.put("6", "c");
	unsortMap.put("7", "b");
	unsortMap.put("8", "a");
 
	Iterator iterator=unsortMap.entrySet().iterator();
 
        for (Map.Entry entry : unsortMap.entrySet()) {
        	System.out.println("Key : " + entry.getKey() 
       			+ " Value : " + entry.getValue());
        }
 
        System.out.println("Sorted Map......");
        Map<String,String> sortedMap =  sortByComparator(unsortMap);
 
        for (Map.Entry entry : sortedMap.entrySet()) {
        	System.out.println("Key : " + entry.getKey() 
       			+ " Value : " + entry.getValue());
        }
   }
 
   private static Map sortByComparator(Map unsortMap) {
 
        List list = new LinkedList(unsortMap.entrySet());
 
        //sort list based on comparator
        Collections.sort(list, new Comparator() {
            @Override
             public int compare(Object o1, Object o2) {
	           return ((Comparable) ((Map.Entry) (o1)).getValue())
	           .compareTo(((Map.Entry) (o2)).getValue());
             }
	});
 
        //put sorted list into map again
	Map sortedMap = new LinkedHashMap();
	for (Iterator it = list.iterator(); it.hasNext();) {
	     Map.Entry entry = (Map.Entry)it.next();
	     sortedMap.put(entry.getKey(), entry.getValue());
	}
	return sortedMap;
   }	
}
