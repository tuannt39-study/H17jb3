/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3stringtuannv;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author TUAN
 */
public class bai10 {
     public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=" ";
        System.out.println("Nhap chuoi: ");
        str= scanner.nextLine();
        System.out.println("Chuoi vua nhap la: " +str);
        String [] str1=str.split(" ");
        StringBuilder str2=new StringBuilder();
        for(int i=0;i<str1.length;i++){
            str2=str2.append(str1[str1.length-i-1]).append(" ");
        }
        System.out.println("Ket qua: " +str2);
    }
}
