/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

import java.util.ArrayList;

/**
 *
 * @author ThaoJ
 */
public class CircleCollection {
    
    ArrayList<Circle> arrl = new ArrayList<>();
    int Size;

    public void getSize() {
        int soluong = arrl.size();
    }
    public void addCircle(Circle c) {
        arrl.add(c);
    }


    public double getCrtcle(Circle c) {
        return arrl.indexOf(c);
    }

    public void setCrtcle(Circle c, int ind) {
        arrl.set(ind,c);
    }
    
    public String toString(){
        return arrl.toString();
    }
    public double TongDienTich(){
        double tongS = 0;
        for (Circle c : this.arrl) {
            tongS = tongS + c.getArea();
        }
        return TongDienTich();
    }
    
    public double maxDienTich() {
        double max = this.arrl.get(0).getArea();
        for (Circle c : this.arrl) {
            if (max < c.getArea()) {
                max = c.getArea();
            }
        }
        return max;
    }
    
    public double minDienTich() {
        double min = this.arrl.get(0).getArea();
        for (Circle c : this.arrl) {
            if (min > c.getArea()) {
                min = c.getArea();
            }
        }
        return min;
    }
    
    public void hinhTronMin(){
        Circle cm = arrl.get(0);
        double min = this.arrl.get(0).getArea();
        for (Circle c : this.arrl) {
            if(c.getArea() < min){
                min = c.getArea();
                cm = c;
            }
        }
        System.out.println("Hinh  tron co dien tich nho nhat la: " + cm.toString());
    }
    
    public static void main(String[] args) {
        CircleCollection cl = new CircleCollection();

        for (int i = 0; i < 5; i++) {
            System.out.println(" vi i : " + i);
            Circle c = new Circle();
            c.radius = (int) Math.round( Math.random()*99);
            cl.addCircle(c);
        }
        System.out.println(" ban kinh: " + cl.toString());
    }
}
