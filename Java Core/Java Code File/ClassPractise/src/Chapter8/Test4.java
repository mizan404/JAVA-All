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
public class Test4 {

    public static void main(String[] args) {
        int[][] values = {{3, 4, 5, 1}, {33, 6, 1, 2}};

        for (int[] value : values) {
            java.util.Arrays.sort(value);
            for (int column = 0; column < value.length; column++) {
                System.out.print(value[column] + " ");
            }
            System.out.println();
        }
    }
}
