/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

/**
 *
 * @author viet
 */
public class Point {
    int x;
    int y;
    
    public Point(){
        
    }
    
    public Point(int xValue,int yValue){
        this.x = xValue;
        this.y = yValue;
    }

    public int getX() {
        return x;
    }

    public void setX(int xValue) {
        this.x = xValue;
    }

    public int getY() {
        return y;
    }

    public void setY(int yValue) {
        this.y = yValue;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
   
    
}
