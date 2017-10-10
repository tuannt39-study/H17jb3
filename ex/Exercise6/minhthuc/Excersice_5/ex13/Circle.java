package Excersice_5.ex13;

/**
 * Created by minht on 5/10/2017.
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "The circle has radius:"+radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
}
