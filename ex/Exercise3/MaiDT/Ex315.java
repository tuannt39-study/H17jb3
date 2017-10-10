/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex315 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập xâu x: ");
        String x = input.nextLine();
        // String numChar = "0123456789";
        int numCount = 0;
        int charCount = 0;
        int wordCount = 0;
        for (char ch : x.toCharArray()) {
            if (Character.isDigit(ch)) {
                numCount += 1;
            } else if (Character.isLetter(ch)) {
                charCount += 1;
            }
        }

        String[] arrX = x.split(" ");
        for (String s : arrX) {
            if (!s.isEmpty()) {
                wordCount += 1;
            }
        }

        System.out.println("Có tất cả:" + numCount + " ký tự số trong xâu.");
        System.out.println("Có tất cả:" + charCount + " ký tự chữ trong xâu.");
        System.out.println("Có tất cả:" + wordCount + " từ trong xâu.");

    }
}
