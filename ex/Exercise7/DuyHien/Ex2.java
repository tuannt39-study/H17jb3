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
public class Ex2 {

    public static void Devide(int a, int b) {
        try {
            int c = a / b;
            System.out.println("Ket qua la : " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Ignore...");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("Nhap so chia: ");
        String str = sc.nextLine();
        try {
            a = Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            System.out.println("Ban nhap chuoi khong hop le, xin vui long chi nhap so.");

        }
        System.out.println("Nhap so bi chia: ");
        str = sc.nextLine();
        try {
            b = Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            System.out.println("Ban nhap chuoi khong hop le, xin vui long chi nhap so.");

        }

        Devide(a, b);
    }
}
