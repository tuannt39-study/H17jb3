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
public class EX3StringTuannv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       String str=" ";
       System.out.println("//////////////////////BAI TAP VE CHUOI/////////////////////");
       int lc=0;
         do{
            System.out.println("1. Nhap chuoi");
            System.out.println("2. Xuat chuoi");
            System.out.println("Ban muon lam gi? ");
            lc=scanner.nextInt();
        switch(lc){
            case 1:{
                Input(str);
                break;
            }
            case 2:{
                Output(str);
                break;
            }
        }
        }
        while(lc!=0);
    }
    public static void Input(String str){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str= scanner.nextLine();
    }
    public static void Output(String str){
        System.out.println("Chuoi vua nhap: " +str );
    }
    
}
