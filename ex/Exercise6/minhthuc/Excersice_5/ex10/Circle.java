package Excersice_5.ex10;

/**
 * Created by minht on 5/10/2017.
 */
public class Circle extends Point{
    private double radius;

    public Circle() {

    }
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getDiameter(){
        return this.getRadius()*2;
    }
    public double getCircumference(){
        return this.getDiameter()*Math.PI;
    }
    public double getArea(){
        return this.getRadius()*this.getRadius()*Math.PI;
    }
}
