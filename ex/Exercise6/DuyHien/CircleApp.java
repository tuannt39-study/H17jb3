/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops2;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author LENOVO
 */
public class CircleApp {
    private Vector<Circle> cl = new Vector<Circle>();
    
    public void createRandomly(){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many circle which you want? ");
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            Circle a = new Circle(r.nextDouble());
            cl.add(a);
        }
    }
    
    public void displayInf(){
        for(int i = 1; i < cl.size(); i++){
             System.out.print(i);
             System.out.print(cl.get(i - 1).toString() + "\n");
        }
    }

    public void total() {
        if (cl.size() == 0) {
            System.out.println("Have no circle to calculate total area. ");
        } else {
            double area = 0;
            for (int i = 0; i < cl.size(); i++) {
                area += cl.get(i).getRadius() * cl.get(i).getRadius() * 3.14;

            }
            System.out.println("Tong dien tich la: " +area);

        }
    }
    public void biggestArea() {
        if (cl.size() == 0) {
            System.out.println("Have no circle to compare area !");
        } else {
            double com = 0;
            double count = 0;
            for (int i = 0; i < cl.size(); i++) {
                double a = cl.get(i).getRadius() * cl.get(i).getRadius() * 3.14;
                if (a > com) {
                    com = a;
                    count = i;
                }
            }
            System.out.println("Dien tich lon nhat la " + com + "thuoc ve hinh tron thu " + (count+1));
        }
    }
    public void smallestArea() {
        if (cl.size() == 0) {
            System.out.println("Have no circle to compare area !");
        } else {
            double com = 9999;
            double count = 0;
            for (int i = 0; i < cl.size(); i++) {
                double a = cl.get(i).getRadius() * cl.get(i).getRadius() * 3.14;
                if (a < com) {
                    com = a;
                    count = i;
                }
            }
            System.out.println("Dien tich nho nhat la " + com + "thuoc ve hinh tron thu " + (count+1));
        }
    }
    public static void main(String[] args) {
        CircleApp h = new CircleApp();
        System.out.println("Welcome you ! ");
        h.createRandomly();
        System.out.println("Ok ! Let see: ");
        System.out.println("Toan bo hinh tron: ");
        h.displayInf();
        h.total();
        h.biggestArea();
        h.smallestArea();
    }
   
}

