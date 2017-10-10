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
public class bai2_1 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String str[]= new String[100];
        int n=0;
        System.out.println("ban muon nhap may chuoi?");
        n=scanner.nextInt();
        Input(str,n);
        Output(str,n);
        int result= Search(str,n);
        if(result==0)
            System.out.println("nhap dung!");
        else
            System.out.println("nhap sai");
    }
    public static void Input(String str[], int n){
        Scanner scanner= new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.println("nhap chuoi " +i+ " :");
            str[i]=scanner.nextLine();
            str[i]=str[i].trim();
        }
    }
    public static void Output(String str[], int n){
        System.out.println("cac chuoi vua nhap la: ");
        for(int i=0; i<n; i++){
            System.out.println(str[i]);
        }
    }
    public static int Search(String str[], int n){
       Scanner scanner= new Scanner(System.in);
       String Str=" ";
       int result []= new int[100];
       System.out.println("nhap chuoi ban muon tim kiem: ");
       Str = scanner.nextLine();
       Str=Str.trim();
       for(int i=0; i<n; i++){
            result[i] =str[i].compareTo(Str);
       }
       for(int j=0; j<n; j++){
           if(result[j]==0){
               return 0;
            }
       }
       return 1;
    }
}
