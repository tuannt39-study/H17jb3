/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author viet
 */
public class CircleCollection {

    ArrayList<Circle> tron = new ArrayList<>();

    public CircleCollection() {
    }

    public void addCircle(Circle c) {
        tron.add(c);
    }

    public int getSize() {
        return tron.size();
    }

    public double getCircle(Circle c) {
        return tron.indexOf(c);
    }

    public void setCircle(int mark, Circle tron) {
        this.tron.set(mark, tron);
    }

    @Override
    public String toString() {
        return "CircleCollection{" + "tron=" + tron + '}';
    }

    public double countArea() {
        double tong = 0;
        for (int i = 0; i < getSize(); i++) {
            tong += tron.get(i).getArea();
        }
        return tong;
    }

    public double maxArea() {
        double max = tron.get(0).getArea();
        for (int i = 0; i < getSize(); i++) {
            if (max < tron.get(i).getArea()) {
                max = tron.get(i).getArea();
            }
        }
        return max;
    }

    public double minArea() {
        double min = tron.get(0).getArea();
        for (int i = 0; i < getSize(); i++) {
            if (min > tron.get(i).getArea()) {
                min = tron.get(i).getArea();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        CircleCollection arr = new CircleCollection();
        Scanner in = new Scanner(System.in);
        float rad;
        for (int i = 0; i < 5; i++) {
            Circle temp = new Circle();
            temp.setRadius((int) Math.round(Math.random() * 10));
            arr.addCircle(temp);
        }

        System.out.println(arr.toString());
    }

}
