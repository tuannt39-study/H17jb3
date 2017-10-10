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
public class bai8 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=" ";
        System.out.println("Nhap chuoi: ");
        str= scanner.nextLine();
        System.out.println("Chuoi vua nhap la: " +str);
        char ch=' ';
        System.out.println("Nhap ky tu muon xoa: ");
        ch= scanner.next().charAt(0);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== ch){
                str= str.replace(str.substring(i, i+1),"");
            }
        }
        System.out.println("Ket qua: " +str);
    }
}
