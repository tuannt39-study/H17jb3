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
//Tim so nguyen to
public class bai11 {
    public static void main(String[]args)
        {
        int n;    
        n = nhapheso("nhap n=");        
        if(n>0)
        {
            if(kiemtra(n)==1)
                System.out.println("La so nguyen to");
            else
                System.out.println("Ko la so nguyen to");
            
        }
    }
    public static int nhapheso(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x= sc.nextInt();
        return x;  
               
    }
    public static int kiemtra(int n)
    {
        int i;
        int dem=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            dem++;
        }
        if(dem==2)
            return 1;
            else return 0;
    }
       
    }

