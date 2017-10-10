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
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Nhap chuoi");
        String str = n.nextLine();
        System.out.print("Nhap tu muon xoa:");
        String str2 = n.nextLine();
        str = str.replace(str2, "");
        System.out.println("Chuoi con lai :" + str);
    }
    
}
