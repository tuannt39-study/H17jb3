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
public class bai5 {
    public static void main(String[]args )
    {
        int n;    
        n = nhapheso("nhap he so n=");
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
        int tong=0;
        for(i=1;i<=n;i++)
        {
            tong+=i;
        }
        System.out.println("Tong S= "+tong);
    }
    
}
