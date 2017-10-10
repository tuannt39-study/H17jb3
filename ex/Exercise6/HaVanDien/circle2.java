/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;
import Bai6.point;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class circle2 extends point{
    private double circle;
    private double diamete;
    private double circumference;
    private double area;
    private ArrayList<circle2> list=new ArrayList<>();

    /**
     * @return the circle
     */
    public circle2(int x,int y,double circle){
        this.x=x;
        this.y=y;
        this.setCircle(circle);
    }

    private circle2() {
    }
    public double getCircle() {
        return circle;
    }
    
    /**
     * @param circle the circle to set
     */
    public double setCircle(double circle) {
        if(circle>0)
            this.circle=circle;
        else{
            System.out.println("Nhap lai ban kinh");
        }
            return circle;
    }

    /**
     * @return the diamete
     */
    public double getDiamete() {
        diamete=circle*2;
        return diamete;
    }

    /**
     * @param diamete the diamete to set
     */
    public void setDiamete(double diamete) {
        diamete= circle*2;
        this.diamete = diamete;
    }

    /**
     * @return the circumference
     */
    public double getCircumference() {
        return circumference;
    }

    /**
     * @param circumference the circumference to set
     */
    public void setCircumference(double circumference) {
        circumference= 2*circle*Math.PI;
        this.circumference = circumference;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        area= Math.PI*circle*circle;
        this.area = area;
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("#.00");
        return "Toa do: "+x+","+y+" Duong Kinh: "+df.format(diamete)+" Chu vi: "+df.format(circumference)+" Dien tich: "+df.format(area);
    }
    public static void main(String[] args) {
        ArrayList<circle2> list= new ArrayList<>();
        System.out.println("Nhap vao so hinh tron:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap vao toa do x");
            int x= sc.nextInt();
            System.out.println("Nhap vao toa do y");
            int y= sc.nextInt();
            System.out.println("Nhap vao ban kinh");
            double r=sc.nextDouble();
            circle2 c= new circle2(x, y, r);
            c.setArea(r);
            c.setCircumference(r);
            c.setDiamete(r);
            list.add(c); 
        }
        System.out.println(list.toString());
    }
}
