/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworke1.pkg1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ex4 {
    public static void GiaiPTB2(double a, double b, double c){
       double delta = (b*b) - (4*a*c);
       double x1 = ((-b) + (delta))/ ((2*a));
       double x2 = ((-b) - (delta))/ ((2*a));;
       double x3 = (-b) / (2*a);
        if(0 > delta){
           System.out.println("Have no solution!");
            }else if( 0 == delta){
           System.out.println("double roots is: " +x3);
    }else{
                System.out.println("The roots is: " +x1 + "," +x2);
         }
    }
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Phuong trinh bac 2 co dang : ax^2 + bx + c = 0 . ");
        System.out.println("Nhap a: ");
        num1 = sc.nextDouble();
        System.out.println("Nhap b: ");
        num2 = sc.nextDouble();
        System.out.println("NHap c: ");
        num3 = sc.nextDouble();
        GiaiPTB2(num1, num2, num3);
    }
}

