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
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int kytu=0,so=0,chu=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                kytu++;
            }
            else if(Character.isDigit(str.charAt(i))){
                so++;
            }                         
        }
        String[] arrStr = str.split("\\s",0);
        for (String strArr1 : arrStr) {
            if (!strArr1.isEmpty()) 
                chu++;         
        }
        System.out.println("So ky tu: " + kytu);
        System.out.println("So chu so: " + so);
        System.out.println("So tu: " + chu);
    }
    
}
