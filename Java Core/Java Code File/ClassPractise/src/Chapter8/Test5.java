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
public class Test5 {

    public static void main(String[] args) {
        int[][] matrix
                = {{1, 2, 3, 4},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}};

        for (int i = 0; i < 4; i++) {
            System.out.print(matrix[1][i] + " ");
        }
    }
}
