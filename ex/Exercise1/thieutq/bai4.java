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
public class bai4 {
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        int delta;
        a=nhapheso("Nhap he so a:");
        b=nhapheso("Nhap he so b:");
        c=nhapheso("Nhap he so c:");      
        GPTbac2(a,b,c);
        
                
    }
    public static int nhapheso(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x= sc.nextInt();
        return x;   
               
    }
    public static void GPTbac2(int a, int b, int c)
    {
        if(a==0)
          System.out.println("GPT bac nhat");
        else
        {         
         double delta=b*b-4*a*c;
         if(delta<0)
         {
            System.out.println("PT VN");
         }
         else if(delta >0)
         {
             System.out.println("Phuong trinh co nghiem x1="+(-b+Math.sqrt(delta))/2*a);
             System.out.println("Phuong trinh co nghiem x2="+(-b-Math.sqrt(delta))/2*a);                      
                          
         }
         else
             System.out.println("Phuong trinh co 1 nghiem x="+(-b/2*a));
        }
        
    }
    
}
