/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai1 {
    public static void main(String[] args)
  {
     System.out.print("Nhap xau:"); 
     Scanner input=new Scanner(System.in);     
     String str=input.next();
     System.out.print("Nhap ky tu dem: ");
     char ch=(char) input.next().charAt(0);
     int count=0;
     for(int i=0;i<str.length();i++)
         if(ch==str.charAt(i)) count++;
     System.out.println("So lan xuat hien "+ch+": "+count);
  }
    
}
