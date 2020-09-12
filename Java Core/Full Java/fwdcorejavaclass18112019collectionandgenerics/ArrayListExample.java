package collectionexample;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        //Define a Growable ArrayList
        ArrayList<String> list = new ArrayList();

        System.out.println("Size::" + list.size() + 
                " and, Element inside the ArrayList:: " + list);

        //Add some Element into ArrayList
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add(2, "s");   //Add the "s" into 2nd position 

        System.out.println("Size::" + list.size() + 
                " and, Element inside the ArrayList:: " + list);

        //Remove some element from the ArrayList
        list.remove("A");
        list.remove(2);  //removing using position

        System.out.println("Size::" + list.size() + 
                " and, Element inside the ArrayList:: " + list);

        //Replace element "C" with "Z"
        list.remove("C");
        list.add(2, "Z");
        //list.removeAll(list);
        System.out.println("Size::" + list.size() + 
                " and, Element inside the ArrayList:: " + list);
        //looping array list
        for (int i = 0; i < list.size(); i++) {
            String s  = list.get(i);
            System.out.print(s+" ");            
        }
        list.removeAll(list);
        System.out.println("Size::" + list.size() + 
                " and, Element inside the ArrayList:: " + list);
    }
}
