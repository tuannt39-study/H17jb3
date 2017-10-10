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
public class Ex314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập đường đẫn:");
        String url = input.nextLine();
        String fileName = url.substring(url.lastIndexOf("/") + 1);
        // fileName = fileName.substring(0, fileName.indexOf("."));
        String[] spl = fileName.split("[.]");
        System.out.println("Tên đường dẫn là:" + spl[0]);
        String extention = url.substring(url.indexOf(".") + 1);
        System.out.println("Tên phần mở rộng là:" + extention);
        System.out.println("Đường dẫn đầy đủ là :" + url);

    }
}
