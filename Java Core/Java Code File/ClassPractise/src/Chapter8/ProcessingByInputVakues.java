/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import java.util.*;

/**
 *
 * @author User
 */
public class ProcessingByInputVakues {

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        System.out.println("Enter" + matrix.length + "rows and" + matrix[0].length + "columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
                System.out.println(martix[row][column]+"");

            }
            System.out.println();
        }

    }
}
