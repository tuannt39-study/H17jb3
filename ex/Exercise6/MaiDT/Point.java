/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_2;

import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
abstract  class Point {

    public int x, y;

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

    public Point() {
    }

    ;
public Point(int xValue, int yValue) {
        this.x = xValue;
        this.y = yValue;
    }

public String toString(){
return "Tọa độ x:"+this.x+"Tọa độ y:"+this.y;
}
}
