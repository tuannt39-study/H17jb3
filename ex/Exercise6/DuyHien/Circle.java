/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops2;



/**
 *
 * @author LENOVO
 */
public class Circle {

    private double radius;
    

    public Circle( double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius( double radius) {
        this.radius = radius;
    }
    
    public  double getArea(){
        return (this.radius * this.radius * 3.14);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}' + "Area{" + "area=" + getArea() + '}';
    }


}
