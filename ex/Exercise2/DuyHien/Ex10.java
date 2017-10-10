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
public class Ex10 {
    public static void count(int a){
        int total = 0;
        while(a > 0){
            total += a%10;
            a = a/10;
        }
        System.out.println("The total of your number is: " +total);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        count(num);
    
        }
    }

