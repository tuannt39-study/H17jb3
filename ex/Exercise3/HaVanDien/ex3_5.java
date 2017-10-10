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
public class ex3_5 {
    public static void main(String[] args)
    {
        String str,str1;
        int c=0,s=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        str=sc.nextLine();
        System.out.println("so ky tu trong chuoi: "+str.length());
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)>=65 && str.charAt(i)<=122)
            {
                 c++;
            }
            else if(str.charAt(i)>=48 && str.charAt(i)<=57)
            {
                s++;
            }
        System.out.println("So chu cai trong chuoi la: "+c);
        System.out.println("So chu so trong chuoi la: "+s);
        String[] arr;
        str1=str;
        while (str1.indexOf("  ") != -1) str1 = str1.replaceAll("  "," ");
        arr=str1.split("\\s",0);
        System.out.println("So tu trong chuoi: "+arr.length);
    }
    
}
