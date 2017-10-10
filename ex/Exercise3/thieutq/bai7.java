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
//xoa khoang trang,nguyen am
public class bai7 {
    public static void main(String[] args) {
        System.out.println("Nhap xau: ");     
        String[] vowel={"a","e","i","o","u","y"};
        Scanner input=new Scanner(System.in);
        String str=input.nextLine().trim();
        StringBuilder stb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ') stb.append(str.charAt(i));
            else if(str.charAt(i)==' '){
                stb.append(' ');
                while(str.charAt(i)==' ') i++;
            }
         for(String ch:vowel){
            if(str.contains(ch))
                str=str.replaceAll(ch, "");
        }    
        }
        System.out.println("Ket qua: "+str);       
     
    } 
}
