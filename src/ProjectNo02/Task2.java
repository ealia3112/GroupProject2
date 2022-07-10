package ProjectNo02;

import static java.lang.Math.PI;

public class Task2 {/*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
     Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */
}

interface Shape {
    void calculateArea();

    void calculatePerimeter();

}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of a circle with radius " + radius + " is " + PI * (radius * radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of a circle with radius " + radius + " is " + (2 * PI * radius));
    }
}

class Square implements Shape {

    double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void calculateArea() {
        System.out.println("Are of a square with side length " + sideLength + " is " + (sideLength * sideLength));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of a square with side length " + sideLength + " is " + 4 * (sideLength));
    }
}

class ShapeTester {
    public static void main(String[] args) {

        Shape[] obs = {new Circle(9), new Square(7.80)};
        for (Shape ob : obs) {
            ob.calculateArea();
            ob.calculatePerimeter();

        }
    }
}
