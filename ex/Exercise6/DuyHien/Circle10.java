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

public class Circle10 extends Point{
    private double radius;

    public Circle10() {

    }
    public Circle10(int x, int y, double radius) {
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
        return this.getDiameter()* 3.14;
    }
    public double getArea(){
        return (this.radius * this.radius * 3.14);
    }
}


