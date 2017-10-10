/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Circle {

    float radius;
    private float area;

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float Area() {
        setArea((float) (Math.PI * radius * radius));
        return getArea();
    }
    public void add(Circle c) {
        System.out.println("Nhap vao ban kinh");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        radius = a;
        this.Area();
    }
    @Override
    public String toString() {
        return "Ban Kinh: " + this.getRadius() + "Dien Tich" + this.Area();
    }

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

}
