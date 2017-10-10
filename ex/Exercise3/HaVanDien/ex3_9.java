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
public class ex3_9 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.println("Nhap vao xau ki tu");
        str= sc.nextLine();
        System.out.println("Xau nguoc lai");
        for(int i=str.length()-1;i>=0;i--)
            System.out.print(str.charAt(i));
        
    }
    
}
