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
public class ex3_7 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str;
        String[] na={"a","e","u","i","o"};
        int i,k=0;
        String kt=" ";
        System.out.println("Nhap vao chuoi ky tu");
        str= sc.nextLine();
        str=str.trim();
       while (str.indexOf("  ") != -1) str = str.replaceAll("  "," ");
        System.out.println("Loai bo khoang trang");
        for(i=0;i<str.length()-k;i++)
            System.out.print(str.charAt(i));
        for(String ch:na)
            if(str.contains(ch))
                str=str.replaceAll(ch,"");
        System.out.println("\r\nLoai bo nguyen am");
        for(i=0;i<str.length()-k;i++)
            System.out.print(str.charAt(i));
        
    }
    
}
