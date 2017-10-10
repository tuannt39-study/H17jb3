/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3stringtuannv;
import java.lang.String;
import java.util.Scanner;
/**
 *
 * @author TUAN
 */
public class bai4 {
    public static void main(String[] args){
        String str="/home/user/filename.png";
        System.out.println("Ten file: " +str.split("/")[3]);
        System.out.println("Phan mo rong: " +str.split("/")[1]);
        System.out.println("Phan mo rong: " +str.split("/")[2]);
        System.out.println("Duong dan: " +str);
    }
}
