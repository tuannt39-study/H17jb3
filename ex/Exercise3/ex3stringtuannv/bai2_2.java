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
public class bai2_2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str1=" ";
        String str2=" ";
        System.out.println("nhap chuoi: ");
        str1=scanner.nextLine();
        str1=str1.trim();
        System.out.println("nhap ten: ");
        str2=scanner.nextLine();
        str2=str2.trim();
        if(str1.contains(str2))
            System.out.println("nhap dung!");
        else
            System.out.println("nhap sai!");
    }
}
