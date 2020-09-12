package Evidence;

public class Truck extends Vehicle {

    private final int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        } else {
            return super.getSalePrice();
        }
    }

    public static void main(String[] args) {
        Truck truck = new Truck(120, 2000, "Red", 2500);
        System.out.println("Truck Sale Price is " + truck.getSalePrice());
    }

}
