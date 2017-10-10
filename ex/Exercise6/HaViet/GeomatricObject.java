/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

import java.util.Date;

/**
 *
 * @author viet
 */
public abstract class GeomatricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;
    
    protected GeomatricObject(){
        
    }
    
    protected GeomatricObject(String color,boolean filled,Date dateCreated){
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public abstract String toString();
    public abstract double getArea();
    public abstract double getPerimeter();
    
    
    
    
}
