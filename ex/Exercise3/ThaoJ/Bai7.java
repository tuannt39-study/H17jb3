/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author ThaoJ
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] arrStr={"a","e","i","o","u","y"};
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str=input.nextLine();
        str = str.replace(" ", "");
        for(String s:arrStr){
            if(str.contains(s))
                str=str.replaceAll(s, "");
        }
        System.out.println(str);
    }
    
}
