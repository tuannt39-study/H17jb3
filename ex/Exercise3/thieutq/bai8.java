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
//Nhập một chuỗi bất kì, yêu cầu nhập 1 kí tự muốn xóa. Thực hiện xóa tất cả những kí tự đó trong chuỗi
public class bai8 {
    public static void main(String[] args)
    {
        System.out.println("Nhap xau: ");
        Scanner sc=new Scanner(System.in);
        String str,kt;        
        str=sc.nextLine();
        System.out.println("Nhap vao ki tu xoa: ");
        kt=sc.nextLine();
        if(str.contains(kt))
            str=str.replaceAll(kt,"");
        System.out.println("ket qua: ");
        System.out.println(str);
        
    }
    
}
