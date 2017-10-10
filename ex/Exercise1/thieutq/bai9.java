/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
// Fibonacci
public class bai9 {
    public static void main(String[]args)
                {
        int n;
        int Fthun;
        n = nhapheso("nhap n=");
        Fibonacci(n);
    }
    public static int nhapheso(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x= sc.nextInt();
        return x;  
               
    }
    public static void Fibonacci(int n)
    {
        int i;
        int Fthun=1;
        int f0=1;
        int f1=1;
        float tong=1;
        if(n>1);
        {
            for(i=2;i<=n;i++)
            {   
                Fthun=f1+f0;
                f0=f1;
                f1=Fthun;
            }
        }
        System.out.println("Fibonacci cua so thu "+n +" la: "+Fthun);
    }
    
}
