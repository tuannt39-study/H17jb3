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
public class bai6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=" ";
        System.out.println("Nhap chuoi: ");
        str= scanner.nextLine();
        System.out.println("Chuoi vua nhap la: " +str);
        char ch[]= new char[100];
        char kt= ' ';
        int soch[]= new int[100];
//        ch=str.toCharArray();
        int max=0;
        for(int i=0; i<str.length(); i++){
            ch[i]=' ';
            soch[i]=0;
            for(int j=1; j<str.length(); j++){
                ch[i]=str.charAt(i);
                if(str.charAt(j)== ch[i]){
                    soch[i]++;
                }
            }
            if(soch[i]>max){
                max=soch[i];
                kt=ch[i];
            }
        }
        System.out.println("ky tu " +kt+ " xuat hien nhieu nhat voi " +max+ " lan");
    }
}
