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
public class CircleTest {
    public static void main(String[] args) {
        // Properties
        int xValue;
        int yValue;
        float radius;
        Scanner in = new Scanner(System.in);
        ArrayList<Circle> tron = new ArrayList<>();
        // Size
        System.out.print("Nhap kich co : ");
        byte n = in.nextByte();
        // Input
        for ( int i = 0 ; i < n ; i++ ){
            System.out.print("Nhap x :");
            xValue = in.nextInt();
            System.out.print("Nhap y: ");
            yValue = in.nextInt();
            System.out.print("Nhap r : ");
            radius = in.nextFloat();
            Circle temp  = new Circle(xValue,yValue,radius);
            temp.setRadius(radius);
            tron.add(temp);            
        }
        //
        System.out.println("Xuat thong tin");
        //
        
            System.out.println(tron.toString());
        
            
        
        
        
    }
}
