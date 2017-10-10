/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13;

/**
 *
 * @author Win7
 */
public class Circle2 extends GeometricObject {
    double radius;
    
    Circle2(){}
    Circle2(double radiusValue){
        this.radius = radiusValue;
    }
    
    public void setRadius(double radiusValue){
        radius = radiusValue;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getDiameter(){
        return radius*2;
    }
    
    @Override
    public String toString(){
        return ("Circle radius: "+radius);
    }
    
    public double getArea(){
        return radius*radius*3.14;
    }
    public double getPerimeter(){
        return 3.14*getDiameter();
    }
}
