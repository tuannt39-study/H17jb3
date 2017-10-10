/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LilyEvans
 */
public class Ex1_2 {

    public static double division() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter dividend and divisor: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            return a / b;
        } catch (Exception e) {
            System.err.println("Error");
            return 0;
        }
    }

    public static double division2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend and divisor: ");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            return a / b;
        } catch (InputMismatchException e) {
            System.err.println("Error InputMismatchException");
            return 0;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(division2());
    }

}
