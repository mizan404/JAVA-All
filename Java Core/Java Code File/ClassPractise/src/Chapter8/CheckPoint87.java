/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author User
 */
public class CheckPoint87 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(m1(array)[1]);
        System.out.println(m1(array)[1]);
        
    }

    public static int[] m1(int[][] m) {
        int[] result = new int[3];
        result[0] = m.length;
        result[1] = m[0].length;
        result[2] = m[1].length;
        return result;
    }
}
