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
public class Rectangle2 extends GeometricObject{
    double width;
    double height;
    
    Rectangle2(){}
    Rectangle2(double w, double h){
        width = w;
        height = h;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public String toString(){
        return ("Width = "+width+"\nHeight = "+height);
    }
    
    public double getArea(){
        return width*height;
    }
    
    public double getPerimeter(){
        return 2*(width+height);
    }
}
