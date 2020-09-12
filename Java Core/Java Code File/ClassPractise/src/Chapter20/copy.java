/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter20;

import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Students
 */
public class copy {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> list2 = Arrays.asList("white", "black", "Gazi");
        Collections.copy(list1, list2);
        System.out.println(list1);

        List<GregorianCalendar> list3 = Collections.nCopies(5, new GregorianCalendar(2020, 0, 1));
        System.out.println(" " + list3 + " ");

        List<String> list = Arrays.asList("red", "green", "blue");
        Collections.fill(list, "black");
        System.out.println(list);
    }
}
