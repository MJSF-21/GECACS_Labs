abstract class Shape {
    abstract void area(double x, double y);
}

// Rectangle class
class Rectangle extends Shape {

    @Override
    void area(double x, double y) {
        System.out.println("Area of Rectangle: " + (x * y));
    }
}

// Circle class
class Circle extends Shape {

    @Override
    void area(double radius, double unused) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

// Triangle class
class Triangle extends Shape {

    @Override
    void area(double base, double height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

// Main class
public class Practical10{

    public static void main(String[] args) {

        Shape r = new Rectangle();
        r.area(2, 5);

        Shape c = new Circle();
        c.area(5, 0);

        Shape t = new Triangle();
        t.area(2, 5);
    }
}