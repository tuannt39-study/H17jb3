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
public class Ex3 {
    public static void GiaiPTB1(double a, double b){
        double x = -b/a;
        if(0 == a && 0 != b){
           System.out.println("Have no solution!");
            }else{
           System.out.println("The solution is: " +x);
    }
    
    }
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Phuong trinh bac 1 co dang : ax + b = 0 . ");
        System.out.println("Nhap a: ");
        num1 = sc.nextInt();
        System.out.println("Nhap b: ");
        num2 = sc.nextInt();
        GiaiPTB1(num1, num2);
    }
}
