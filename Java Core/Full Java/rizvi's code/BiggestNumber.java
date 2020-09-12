
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;



public class BiggestNumber {
    static List<Integer> numbers = new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int nums");
        int n = sc.nextInt();
        int i = 0;
        while(n!= 1){
            numbers.add(n);
            n = sc.nextInt();
        }
        System.out.println(getBiggestNum(numbers));
    }
    public static int getBiggestNum(List<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() -1);
    }
    
}
