/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String str;
        char a,k = 0;
        int i,kt=0;
        System.out.println("Nhap vao xau ky tu: ");
        str = sc.nextLine();
        System.out.println("Nhap vao ky tu can dem:");
        try{
            k=(char)System.in.read();
        }
        catch(Exception e)
        {
            System.out.println("Nhap loi!");
        }
        for(i=0;i<str.length();i++)
        {
            a=str.charAt(i);
            if(k == a) {
                kt++;
            }
        }
        System.out.println("So lan xuat hien ky tu "+ k +" la:"+kt);
    }
    
}
