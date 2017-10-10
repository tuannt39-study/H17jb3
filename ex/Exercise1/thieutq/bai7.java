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
// tinh giai thua cua n phan tu
public class bai7 {
    public static void main(String[]args)
        {
        int n;    
        n = nhapheso("nhap n=");
        giaithua(n);
    }
    public static int nhapheso(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x= sc.nextInt();
        return x;  
               
    }
    public static void giaithua(int n)
    {
        int i;
        long giaithua=1;
        for(i=1;i<=n;i++)
        {
            giaithua *=i;
        }
        System.out.println("Giai thua cua "+n+" la: "+giaithua);
    }
}
