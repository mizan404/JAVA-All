/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author User
 */
public class Vehicle {

    int wheels;

    private Vehicle(int wheels) {
        wheels = wheels;
        System.out.println(wheels + " wheeler vehicle created.");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
        Vehicle v2 = new Vehicle(3);
        Vehicle v3 = new Vehicle(4);
        System.out.println();
    }
}
