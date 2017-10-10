/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author ThaoJ
 */
public class Circle {
    int radius;
    double Area;

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public Circle() {
    
    }
    
    @Override
    public String toString() {
        return "ban kinh =" + this.radius + ",\n Dien tich =" + getArea();
    }
}
