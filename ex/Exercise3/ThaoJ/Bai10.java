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
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String str=input.nextLine();
        String[] arrStr= str.split(" ");
        StringBuilder ketqua = new StringBuilder();
        for(int i=0;i<arrStr.length;i++){
            ketqua=ketqua.append(arrStr[arrStr.length -i -1]).append(" ");
        }
        System.out.println("Chuoi doi xung la: " + ketqua);
    }
    
}
