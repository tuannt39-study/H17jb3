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
public class bai3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=" ";
        char arr[];
        arr = new char[100];
        System.out.println("nhap chuoi: ");
        str= scanner.nextLine();
        System.out.println("Ket qua: ");
        int i=0;
        if(str.charAt(0)!=' '){
                arr[0]=str.charAt(0);
                System.out.print(""+arr[0]);
        }
        while(i<str.length()-1){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                arr[i]=str.charAt(i+1);
                System.out.print(" " +arr[i]);
            }
            i++;
        }
        System.out.println("");
    }
}
