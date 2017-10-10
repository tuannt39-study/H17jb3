/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex10;

/**
 *
 * @author Win7
 */
public class Circle extends Point {
    double radius;
    
    Circle(){}
    Circle(int xValue, int yValue,double radiusValue){
        super(xValue,yValue);
        this.radius = radiusValue;
    }
    
    public void setRadius(double radiusValue){
        radius = (radiusValue>=0?radiusValue:0);
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getDiameter(){
        return radius*2;
    }
    
    public double getCircumference(){
        return 3.14*getDiameter();
    }
    
    public double getArea(){
        return 3.14*radius*radius;
    }
    
    public String toString(){
        return ("[x,y],Radius = ["+x+", "+y+"], "+radius);
    }
}
