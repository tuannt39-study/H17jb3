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
public class Ex6 {
    public static void Count(double a){
        double total = 0;
        for(double i = 1; i <= a; i++){
            total += 1/i;
        }
        System.out.println("The total is: " +total);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        System.out.println("Enter your number: ");
        num1 = sc.nextDouble();
        Count(num1);
    }
}

