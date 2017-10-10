/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex317
 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập xâu x: ");
        String x = input.nextLine();
        String[] nguyenAm = new String[]{"u", "e", "o", "a", "i"};
        x = x.replace(" ", "");
        for (String s : nguyenAm) {

            x = x.replace(s, "");
        }
        System.out.println("Xâu cần tìm là:" + x);
    }
}
