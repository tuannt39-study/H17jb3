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
public class bai2 {
    public static void main(String[] args)
    {
        System.out.println("Ho va ten:");
        String str,str1;
        int kt=0;
        Scanner sc=new Scanner(System.in);        
        str=sc.nextLine();
        System.out.println("kiem tra");
        str1=sc.nextLine();
        for(String a:str.split("\\s",0))
        {
            if(a.equals(str1))
                kt=1;                
        }
        if(kt==1)
        System.out.println("Dung");
        else
        System.out.println("Sai");
        
    }
    
}
