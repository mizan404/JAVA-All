package generics_ex;

import java.util.List;
import java.util.ArrayList;

public class GenericsNotCovarient {

    public static void main(String[] args) {
        //valid because an Integer is a Number, and an Integer array 
        //is a Number array. 
        Integer[] intArray = new Integer[10];
        Number[] numberArray = intArray;
        // However, the same is not true with generics. 
        // The following code is invalid
        List<Integer> intList = new ArrayList();
//        List<Number> numberList = intList; // invalid

    }
}
