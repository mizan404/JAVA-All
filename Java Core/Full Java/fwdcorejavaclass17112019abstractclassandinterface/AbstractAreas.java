package abstractexample;

abstract class Figure {
    double dim1;
    double dim2;
    int x=4;

    Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }
    Figure(){}
    // area is now an abstract method
    abstract double area(); 
    void sum(){}
}

 class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
        int d;
    }
    // override area for rectangle

    @Override
    protected double area() {
        Figure f[] = new Figure[3];
        f[0] = new Rectangle(dim1, dim1);
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
        
    }   
}

class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }
    // override area for right triangle
    @Override
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

class AbstractAreas {
    public static void main(String args[]) {
         //Figure f = new Figure(10, 10); // illegal now
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 5);
        Figure figref; // this is OK, no object is created
        figref = r;
        System.out.println("Area is " + r.area());
        figref = t;
        System.out.println("Area is " + t.area());
    }
}
