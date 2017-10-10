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
public class Point {
    protected int x;
    protected int y;
    
    Point(){}
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(int xValue){
        x = xValue;
    }
    
    public int getX(){
        return x;
    }
    
    public void setY(int yValue){
        y = yValue;
    }
    
    public int getY(){
        return y;
    }
    
    public String toString(){
        return ("["+x+", "+y+"]");
    }
}
