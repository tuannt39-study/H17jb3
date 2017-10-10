/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
//dao nguoc chuoi
public class bai9 {
    public static void main(String[] args) {
 
     System.out.println("Nhap xau: ");
 
     Scanner input=new Scanner(System.in);
     String xau=input.nextLine(); 
     char[] xaudao=xau.toCharArray(); 
     for(int i=0;i<xau.length()/2;i++)
     { 
          char temp=xaudao[i]; 
          xaudao[i]=xaudao[xaudao.length-i-1]; 
          xaudao[xaudao.length-i-1]=temp; 
     } 
     String ketqua= String.valueOf(xaudao); 
     System.out.println("xau dao: "+ketqua); 
     }
    
}
