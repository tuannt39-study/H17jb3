/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
// in ra chuoi doi xung
public class bai10 {
    public static void main(String[] args) {
         System.out.println("Nhap xau: ");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String[] spStr=str.split(" ");
        StringBuilder ketqua=new StringBuilder();
        for(int i=0;i<spStr.length;i++){
            ketqua=ketqua.append(spStr[spStr.length-i-1]).append(" ");
        }
        System.out.println("Ket qua: "+ketqua);
    }
}
