/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex12;

/**
 *
 * @author Win7
 */
public class Rectangle extends Shape{
    int height;
    int width;
    
    Rectangle(){}
    Rectangle(int h, int w){
        height = h;
        width = w;
    }
    
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    
    public void setHeight(int h){
        height = (h<15&&h>1?h:1);
    }
    public void setWidth(int w){
        width = (w<15&&w>1?w:1);
    }
    
    public void draw(){
        
    }
}
