/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ex3_8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str,kt;
        System.out.println("Nhap vao chuoi ki tu");
        str=sc.nextLine();
        System.out.println("Nhap vao ki tu can xoa");
        kt=sc.nextLine();
        if(str.contains(kt))
            str=str.replaceAll(kt,"");
        System.out.println("Chuoi sau khi xoa: ");
        System.out.println(str);
        
    }
    
}
