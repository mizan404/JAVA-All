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
public class Test2 {

    public static void main(String[] args) {
        /// for (int i = 0, j = 0; i + j < 10; i++, j++) {
        //   System.out.println((i * j));
        int i, sum=0; 
        for (i = 0; i < 100; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
