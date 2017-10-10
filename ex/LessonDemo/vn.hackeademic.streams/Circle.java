/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.h17jb3.stream;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Circle implements Serializable{
public int radius;
public double Area;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
    
    public Circle(){
//    Scanner input= new Scanner(System.in);
//        System.out.println("Nhập vào radius:");
//        this.radius=input.nextInt();
       // this.Area=Math.PI*this.radius*this.radius;
    }

    public Circle(int _radius){
    this.radius=_radius;
   // this.Area=Math.PI*this.radius*this.radius;
    }
    public Circle(int _radius, double _area){
    this.radius=_radius;
    this.Area=_area;
   }
    
@Override
    public String toString(){
        StringBuilder sB = new StringBuilder();
        //sB.append();
        //System.out.printf("Bán kính: %d\t|Diện tích: %.2f",this.radius,getArea());
        return "Bán kính:"+this.radius+"\t|Diện tích:"+getArea();
    }
}
