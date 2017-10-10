/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops2;

import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author LENOVO
 */
public class CircleCollection {

    private Vector< Double> r = new Vector< Double>();

    public CircleCollection(Vector<Double> r) {
        this.r = r;

    }

    public Vector<Double> getR() {
        return r;
    }

    public void setR(Vector<Double> r) {
        this.r = r;
    }

    public void addCircle(double newRadius) {
        this.r.add(newRadius);
    }

    public int getSize() {
        int count = 0;
        for (int i = 0; i < r.size(); i++) {
            count += 1;
        }
        return count;
    }

    public void getCircle(int pos) {
        if (isExist(pos)) {
            this.r.get(pos - 1);
        } else {
            System.out.println("Didn't exit circle in this position ");
        }
    }

    public void setCircle(int i, double newR) {
        if (isExist(i)) {
            this.r.set(i, newR);
        } else {
            System.out.println("Didn't exit circle in this position");
        }
    }

    public boolean isExist(int a) {
        if (r.size() > a) {
            return true;

        }
        return false;
    }

    public void totalArea() {
        if (r.size() == 0) {
            System.out.println("Have no circle to calculate total area. ");
        } else {
            double area = 0;
            for (int i = 0; i < r.size(); i++) {
                area += r.get(i) * r.get(i) * 3.14;
            }
        }
    }

    public void biggestArea() {
        if (r.size() == 0) {
            System.out.println("Have no circle to compare area !");
        } else {
            double com = 0;
            double count = 0;
            for (int i = 0; i < r.size(); i++) {
                double a = r.get(i) * r.get(i) * 3.14;
                if (a > com) {
                    com = a;
                    count = i;
                }
            }
            System.out.println("Dien tich lon nhat la " + com + "thuoc ve hinh tron thu " + count);
        }
    }

    public void smallestArea() {
        if (r.size() == 0) {
            System.out.println("Have no circle to compare area !");
        } else {
            double com = 9999;
            double count = 0;
            for (int i = 0; i < r.size(); i++) {
                double a = r.get(i) * r.get(i) * 3.14;
                if (a < com) {
                    com = a;
                    count = i;
                }
            }
            System.out.println("Dien tich nho nhat la " + com + "thuoc ve hinh tron thu " + count);
        }
    }

    @Override
    public String toString() {
        return String.format(r.toString());
    }

}
