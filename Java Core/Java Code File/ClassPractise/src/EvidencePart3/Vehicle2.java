
package EvidencePart3;


public class Vehicle2 {
    private final int speed; 
    private final double regularPrice; 
    private final String color;

    public Vehicle2(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }

   
    
    
}
