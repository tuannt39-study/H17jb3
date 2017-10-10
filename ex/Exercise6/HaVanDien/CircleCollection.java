/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CircleCollection extends Circle {

    private ArrayList<Circle> list = new ArrayList<Circle>();

    public void getSize() {
        int size = getList().size();
    }

    public int getIndex(Circle c) {
        System.out.println(" Nhap vi tri can lay");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > getList().size()) {
            System.out.println("Khong co trong mang");
        } else {
            getList().indexOf(a);
        }
        return getList().indexOf(a);
    }

//    public void setCircle(Circle c,int a) {
//        List.set(Int,a);
//
//    }

    public float tongS() {
        float tongs = 0;
        for (Circle c : this.getList()) {
            tongs += c.getArea();
        }
        return tongs;
    }

    public float maxmin() {
        float max = this.getList().get(0).getArea();
        float min = this.getList().get(0).getArea();
        for (Circle c : this.getList()) {
            if (max < c.Area()) {
                max = c.Area();
            }
            if (min > c.Area()) {
                min = c.Area();
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
        return max;
    }

    /**
     * @return the list
     */
    public ArrayList<Circle> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<Circle> list) {
        this.list = list;
    }
    public static void main(String[] args) {
        ArrayList<Circle> Cl=new ArrayList<>();
        for(int i=0;i<6;i++)
        {
            Circle c = new Circle();
            c.add(c);
            Cl.add(c);
            
        }
        System.out.println(Cl.toString()+"\r\n");
        
    }
}