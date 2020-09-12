package Chapter20;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

public class CheckPoint2019 {

    public static void main(String[] args) {
        List<String> list = Array.asList("yellow", "red", "green", "blue");
        Collections.reverse(list);
        System.out.println(list);
        List<String> list1 = Array.asList("yellow", "red", "green", "blue");
        List<String> list2 = Array.asList("yellow", "red", "green", "blue");
        Collections.copy(list1, list2);
        System.out.println(list1);
        Collection<String> c1 = Array.asList("red", "cyan");
        Collection<String> c2 = Array.asList("red", "blue");
        Collection<String> c3 = Array.asList("pink", "tan");.
        System.out.println(Collections.disjoint(c1, c2));
        System.out.println(Collections.disjoint(c1, c3));
        Collection<String> collection = Array.asList("red", "cyan", "red");
        System.out.println(Collections.frequency(collection, "red"));
    }
}
