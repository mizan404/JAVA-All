package collectionexample.comparetox;

import java.util.*;
/* Comparator interface is used to order the objects of user-defined class. 
 * This interface is found in java.util package and contains only 
 * one method named compare(Object obj1,Object obj2).
 * It provides multiple sorting sequence i.e. 
 * you can sort the elements based on any data member. 
 * For instance it may be of rollno,name,age or anything else. */
public class Simple {

    public static void main(String args[]) {

        ArrayList al = new ArrayList();
        al.add(new Student(101, "Uzzal", 23));
        al.add(new Student(106, "Amlan", 27));
        al.add(new Student(105, "Jia", 21));
        
        System.out.println("Sorting by Name...");

        Collections.sort(al, new NameComparator());
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println("sorting by age...");

        Collections.sort(al, new AgeComparator());
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }


    }
}
