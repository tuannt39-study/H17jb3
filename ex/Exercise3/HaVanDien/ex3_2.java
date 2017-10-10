/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Admin
 */
public class ex3_2 {
    public static void main(String[] args)
    {
        String str,str1;
        int kt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ho va ten:");
        str=sc.nextLine();
        System.out.println("Nhap vao ten kiem tra");
        str1=sc.nextLine();
        for(String a:str.split("\\s",0))
        {
            if(a.equals(str1))
                kt=1;                
        }
        if(kt==1)
        System.out.println("Nhap dung");
        else
        System.out.println("Nhap sai");
        
    }
}
