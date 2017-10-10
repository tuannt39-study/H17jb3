/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.pkg1;

import java.util.Scanner;


/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Ex31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào xâu ký tự:");
        String str = input.nextLine();
        System.out.print("Nhập vào ký tự bất kỳ :");
        char ch1 = (char) input.next().charAt(0);
        System.out.print("Nhập vào ký tự cần đếm :");
        char ch2 = (char) input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch2 == str.charAt(i)) {
                count++;
            }
        }
        System.out.print("Số lần xuất hiện của ký tự " + ch2 + " là:" + count);

    }

}
