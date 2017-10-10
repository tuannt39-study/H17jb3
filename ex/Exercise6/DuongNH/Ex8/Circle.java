/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8;

/**
 *
 * @author Win7
 */
public class Circle {
    float radius;
    
    public double getArea(){
        return radius*radius*3.14;
    }
    
    public String toString(){
        return ("Radius = "+radius+"\tCircle area = "+getArea());
    }
}
