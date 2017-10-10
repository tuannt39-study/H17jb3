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
//import java.util.Date;
public abstract class GeometricObject {
    String color;
    boolean filled;
    java.util.Date dateCreated;
    
    GeometricObject(){}
    GeometricObject(String color, boolean filled, java.util.Date date){
        this.color = color;
        this.filled = filled;
        this.dateCreated = date;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    
    public abstract String toString();
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
}
