/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworke1.pkg1;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Ex5 {
    public static void Count(int a){
        int total = 0;
        for(int i = 1; i <= a; i++){
            total += i;
        }
        System.out.println("The total is: " +total);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Enter your number: ");
        num1 = sc.nextInt();
        Count(num1);
    }
}
