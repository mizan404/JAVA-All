/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author User
 */
public class Test4 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "  ");
            sum += i;
            for (int j = 0; j < 10; j++) {
                System.out.println(j + "  ");
               sum += j;
                for (int k = 0; k < 10; k++) {
                    sum += k;
                    System.out.println(k + "  ");

                }
            }
        }
        System.out.println(sum + "");

    }
}
