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
public class Ex8 {
    public static void Count(int a){
        double total = 0;
        double fact = 1;
        for(int i = 1; i <= a; i++){
            fact = (double) (fact) * (i);
            total = ((total) +  (1/fact));
        }
        System.out.println("The total is: " +total);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Enter your number to calculate: ");
        num1 = sc.nextInt();
        Count(num1);
    }
}


