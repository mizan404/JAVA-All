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
public class Test2 {

    public static void main(String[] args) {
        int[][] values = {{3, 4, 5, 1}, {33, 6, 1, 2}};

        int v = values[0][0];
        for (int[] value : values) {
            for (int column = 0; column < value.length; column++) {
                if (v < value[column]) {
                    v = value[column];
                }
            }
        }

        System.out.print(v);
    }
}
