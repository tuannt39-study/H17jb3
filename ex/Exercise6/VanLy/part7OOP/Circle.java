package part7OOP;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LilyEvans
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * Math.PI;
    }

    public String toString() {
        return "Radius: " + this.getRadius() + " Square: " + this.getArea();
    }
}
