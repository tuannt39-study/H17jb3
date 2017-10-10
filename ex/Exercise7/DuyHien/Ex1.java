/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ex1 {
    public static void Devide(int a, int b){
        try {
            int c = a / b;
            System.out.println("Ket qua la : " +c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Ignore...");
        }
     
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so chia: ");
        int a = sc.nextInt();
        System.out.println("Nhap so bi chia : ");
        int b = sc.nextInt();
        Devide(a,b);
    }
}
    
