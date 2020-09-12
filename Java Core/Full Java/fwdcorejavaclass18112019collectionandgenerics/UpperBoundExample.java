package generics_ex;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundExample {
//    upper bound
//List<? extends Number> means a List of objects that are instances of 
//    the class Number, or subclasses of Number (e.g. Integer or Double)
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(new Integer(3));
        intList.add(new Integer(5));
        intList.add(new Integer(10));
        double sum = sum(intList);
        System.out.println("Sum of intList=" + sum);
        
        List<String> stList = new ArrayList<>();
//        sum(stList);
    }
}
