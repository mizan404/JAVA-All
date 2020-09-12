package Chapter11;

import java.awt.Color;

public class CircleFormSimpleGeomericObject extends SimpleGeometricObject {

    private double radius;

    public CircleFormSimpleGeomericObject() {
    }

    public CircleFormSimpleGeomericObject(double radius) {
        this.radius = radius;
    }

    public CircleFormSimpleGeomericObject(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius + Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is create " + getDateCreated() + "and the radius is " + radius);
    }
}
