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
// tinh tong cua cac so hang trong mot day
public class bai10 {
    public static void main(String[]args)
        {
        int n;    
        n = nhapheso("nhap n=");
        tong(n);
    }
    public static int nhapheso(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x= sc.nextInt();
        return x;  
               
    }
    public static void tong(int n)
    {
        int tong=0;      
       
        while(n>0)
        {
            tong+=n%10;
            n=n/10;
        }
        System.out.println("Tong cua so phan tu trong n la = "+tong);
    }
}
