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
//tính tổng 1/1+1/2+... +1/n của n số hạng
public class bai6 {
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
        int i;
        float tong=1;
        for(i=2;i<=n;i++)
        {
            tong+=(float)1/i;
        }
        System.out.println("Tong cua "+n +" phan tu S= "+tong);
    }
    
}
