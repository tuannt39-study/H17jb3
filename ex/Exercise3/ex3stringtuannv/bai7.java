/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3stringtuannv;
import java.lang.String;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author TUAN
 */
public class bai7 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=" ";
        System.out.println("Nhap chuoi: ");
        str= scanner.nextLine();
        System.out.println("Chuoi vua nhap la: " +str);
        str=str.trim();
        str = str.replaceAll("\\s+", " ");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='u' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)=='U' || str.charAt(i)=='E' || str.charAt(i)=='O' || str.charAt(i)=='A' || str.charAt(i)=='I'){
                str= str.replace(str.substring(i, i+1),"");
            }
        }
        System.out.println("Ket qua: " +str);
    }
}
