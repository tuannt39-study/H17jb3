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
public class Ex313 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào Họ và tên:");
        String str = input.nextLine();
        String[] str2 = str.split(" ");
        System.out.println("Chuỗi ban đầu là:"+str);
        System.out.print("Chuỗi cần tìm là:");
        for (String s : str2) {
            if (!s.isEmpty()) {
                System.out.print(s.charAt(0) + " ");
            }
        }
        System.out.println();

    }
}
