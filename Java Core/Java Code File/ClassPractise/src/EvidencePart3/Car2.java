/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePart3;

/**
 *
 * @author Students
 */
public class Car2 extends Vehicle2 {

    private final int weigth;

    public Car2(int speed, double regularPrice, String color, int weigth) {
        super(speed, regularPrice, color);
        this.weigth = weigth;
    }

    @Override
    public double getSalePrice() {
        if (weigth > 2000) {
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        } else {
            return super.getSalePrice(); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public static void main(String[] args) {
        Car2 car = new Car2(120, 2000, "red", 2500);
        System.out.println("Car2 Sale Price is: " + car.getSalePrice());
    }

}
