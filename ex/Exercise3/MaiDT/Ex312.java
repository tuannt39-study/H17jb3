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
public class Ex312 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào Họ và tên:");
        String str1 = input.nextLine();
        System.out.print("Nhập vào tên cần tìm kiếm:");
        String str2 = input.nextLine();
        String[] spl = str1.split(" ");
        int temp = 0;
        for (String s : spl) {
            if (str2.trim().equalsIgnoreCase(s)) {
                temp = 1;
                break;
            }
        }
        if (temp == 1) {
            System.out.println("Tên:'" + str2 + "' vừa nhập vào là đúng!");

        } else {
            System.out.println("Tên :'" + str2 + "' vừa nhập vào là sai!");
        }

    }

}
