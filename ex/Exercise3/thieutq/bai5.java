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
//Nhập vào một xâu. Đếm xem trong xâu có bao nhiêu ký tự chữ cái, bao nhiêu ký tự chữ số và bao nhiêu từ (các từ ngăn cách với nhau bởi khoảng trắng).
public class bai5 {
    public static void main(String[] args) {
        System.out.println("Nhap xau: ");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int letterCount=0,digitCount=0,wordCount=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))) letterCount++;
            else if(Character.isDigit(str.charAt(i))) digitCount++;                         
        }
        String[] strArr = str.split("\\s",0);
        for (String strArr1 : strArr) {
            if (!strArr1.isEmpty()) 
                wordCount++;         
        }
        System.out.println("So ky tu: "+letterCount);
        System.out.println("So chu so: "+digitCount);
        System.out.println("So tu: "+wordCount);
    }   
    
}
