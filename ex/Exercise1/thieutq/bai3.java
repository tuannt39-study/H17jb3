/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;
import java.util.Scanner; // dùng để nhập dl từ bàn phím2

/**
 *
 * @author Admin
 */
public class bai3 {
    public static void main(String[]args )
    {
        int a;
        int b;
        a = nhapheso("nhap he so a=");
        b= nhapheso("nhap he so b=");
        GPTbac1(a,b);
        
    }
    public static int nhapheso(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x= sc.nextInt();
        return x;   
               
    }
    public static void GPTbac1(int a,int b)
    {
        if(a==0)
        {
            if(b==0)
                System.out.println("Phương trình VSN");
            else
                System.out.println("Phương trình VN");
        }
        else
            System.out.println("Phương trình có nghiệm x= "+(-b/a));         
                                             
            
    }
    
}
