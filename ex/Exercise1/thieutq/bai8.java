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
// tinh tong 1/n!
public class bai8 {
    public static void main(String[]args)
        {
        int n;    
        n = nhapheso("nhap n=");
        tongPS(n);
    }
    public static int nhapheso(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x= sc.nextInt();
        return x;  
               
    }
    public static void tongPS(int n)
    {
        int i;
        long giaithua=1;
        float tongPS=1;
        for(i=1;i<=n;i++)
        {
            giaithua*=i;
            tongPS+=(float)1/giaithua;
        }
        System.out.println("Tong cua "+n +" phan tu S= "+tongPS);
    }
}
