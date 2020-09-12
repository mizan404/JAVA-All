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
public class Test6 {

    public static void main(String[] args) {
        int[][] values = {{3, 4, 5, 1}, {33, 6, 1, 2}};

        for (int[] value : values) {
            System.out.print(m(value) + " ");
        }
    }

    public static int m(int[] list) {
        int v = list[0];
        for (int i = 1; i < list.length; i++) {
            if (v < list[i]) {
                v = list[i];
            }
        }
        return v;
    }
}
