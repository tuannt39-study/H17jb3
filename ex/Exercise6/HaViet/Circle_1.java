/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

import java.text.DecimalFormat;

/**
 *
 * @author viet
 */
public class Circle extends Point {

     double radius;
    

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int xValue, int yValue, double radius) {
        x = xValue;
        y = yValue;        
    }
    
    public void setRadius(double radiusValue){
        this.radius = radiusValue;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double getDiameter(){
        return 2 * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(radius, radius);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "["+x+","+y+"]"+" Circle{" + "radius=" +df.format(radius) + "} Duong kinh : " +df.format(getDiameter())+ " Chu vi : "+df.format(getCircumference())+" Dien tich : "+df.format(getArea());
    }
    
    
}
