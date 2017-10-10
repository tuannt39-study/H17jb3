package Excersice_5.ex_7;

/**
 * Created by minht on 5/10/2017.
 */
public class Circle {
    private long radius;
    private final double pi = Math.PI;
    public Circle(long radius) {
        this.radius = radius;
    }

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*pi;
    }
    public String toString(){
        return "this area is "+ this.getArea() +" and the radius is: "+this.getRadius();
    }

}
