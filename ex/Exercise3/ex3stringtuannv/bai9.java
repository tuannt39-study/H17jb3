/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3stringtuannv;
import java.lang.String;
import java.util.Scanner;
/**
 *
 * @author TUAN
 */
public class bai9 {
     public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=" ";
        System.out.println("nhap xau: ");
        str= scanner.nextLine();
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
         System.out.println("");
     }
}
