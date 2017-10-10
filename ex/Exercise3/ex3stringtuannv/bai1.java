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
public class bai1 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String str=" ";
        char ch=' ';
        int count=0;
        try{
        System.out.println("nhap xau: ");
        str=scanner.nextLine();
        System.out.println("nhap ky tu: ");
        ch=scanner.next().charAt(0);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch)
                count++;
        }
        System.out.println("ky tu \"" +ch+ "\" xuat hien " +count+ " lan trong xau!");
        }catch(Exception e){
            System.out.println("nhap du lieu bi loi!");
        }
    }
}
