/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex318
 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập xâu x: ");
        String str = input.nextLine();
        System.out.print("Nhập vào ký tự muốn xóa:");
        String str2 = input.nextLine();
        str = str.replace(str2, "");
        System.out.println("Chuỗi sau khi xóa:" + str);

    }
}
