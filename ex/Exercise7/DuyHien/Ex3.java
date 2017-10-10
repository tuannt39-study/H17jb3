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
public class Ex3 {

    public static void TinhToan(int a, int b, char c) {
        try {
            switch (c) {
                case '+':
                    System.out.println("Result is : " + (a + b));
                    break;
                case '-':
                    System.out.println("Result is : " + (a - b));
                    break;
                case '/':
                    try {
                        System.out.println("Result is : " + (a / b));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                        System.out.println("Ignore...");
                    }

                    break;
                case '*':
                    System.out.println("Result is : " + (a * b));
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Ignore...");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int nu = sc.nextInt();
        System.out.println("Nhap so thu 2 : ");
        int nu1 = sc.nextInt();
        System.out.println("Nhap phep tinh : ");
        char c = sc.next().charAt(0);
        TinhToan(nu, nu1, c);
    }
}
