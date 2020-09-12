package collectionexample.comparablex;

import java.util.*;
/*Comparable interface is used to order the objects of user-defined class.
 * This interface is found in java.lang package and contains only 
 * one method named compareTo(Object).
 * It provide only single sorting sequence 
 * i.e. you can sort the elements on based on single datamember only.
 * For instance it may be either rollno,name,age or anything else. */

public class Sample {

    public static void main(String args[]) {

        ArrayList<Student> al = new ArrayList();
        al.add(new Student(101, "Bari", 23));
        al.add(new Student(106, "Lalon", 27));
        al.add(new Student(105, "Akash", 21));

        Collections.sort(al);
//        Iterator<Student> itr = al.iterator();
//        while (itr.hasNext()) {
//            Student st =  itr.next();
//            System.out.println(st.rollno + " " + st.name + " " + st.age);
//        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
