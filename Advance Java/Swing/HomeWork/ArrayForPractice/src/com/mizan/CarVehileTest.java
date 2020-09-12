/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.Scanner;

/**
 *
 * @author mohdm
 */
public class CarVehileTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cost");
        int cost = scan.nextInt();
        System.out.println("Milege");
        int milege = scan.nextInt();
        System.out.println("Color");
        String color = scan.next();
        System.out.println("Tyres");
        int tyres = scan.nextInt();
        System.out.println("Model");
        String model = scan.next();

//        Car car = new Car(cost, milege, color, tyres);
//        car.vehicle_details();
//        car.car_details();
        Toyata toyata = new Toyata(cost, milege, color, tyres, model);
        toyata.vehicle_details();
        toyata.car_details();
        toyata.toyata_details();

    }
}
