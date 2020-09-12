package Chapter20;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparatorExample {

    public static void main(String[] args) {
        Comparator<String> stringLengthComparetor = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.lastIndexOf();
                

            }

        };
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator); 
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Abu");
        namePriorityQueue.add("Abo");
        namePriorityQueue.add("Anu");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Charis");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");
        
        while(!namePriorityQueue.isEmpty()){
            System.out.println("Length: " + namePriorityQueue.peek().length());
            System.out.println(namePriorityQueue.remove());
        
        }
    }
}
