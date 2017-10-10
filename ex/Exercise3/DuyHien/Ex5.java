/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = input.nextLine();
        int letterCount = 0, digitCount = 0, wordCount = 0;
        for(int i=0 ; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))) 
                letterCount++;
            else if(Character.isDigit(str.charAt(i))) 
                digitCount++;                         
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


