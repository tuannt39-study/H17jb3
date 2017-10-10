/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Ex9 {
    public static void Fibonacci(int n){
         int a = 0;
         int b = 1;
         int max = 0;
         
         System.out.println("The program find the Fibonacci number " +n );
         for(int i = 0; i < n; i++){
          int c = a + b;
          a = b;
          b = c;
           System.out.print(c);
           max = c;
               System.out.print(" ");
               System.out.println(" ");
   
               
         }
         System.out.println("Number " +n + " of fi is: " +max);
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number of fi: ");
        int num = sc.nextInt();
        while(num < 2){
            System.out.println("Enter the n number of fi and must >= 2 ok?  ");
            num = sc.nextInt();
        }
        Fibonacci(num);
    }
}
