/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ex4 {

    public static int Nhap(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Enter again: ");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (0 == a) {
            System.out.println("Nhap so thu nhat: ");
            a = Nhap(sc);
        }
        while (0 == b) {
            System.out.println("NHap so thu 2: ");
            b = Nhap(sc);
        }

        System.out.println("Tong 2 so: " + (a + b));
    }
}

