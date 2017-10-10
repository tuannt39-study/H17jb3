/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.Scanner;

/**
 *
 * @author VIET - HP8570W
 */
public class Bai4 {

    public static void main(String[] args) {

        int a, b;
        boolean check;
        do {
            try {
                check = true;
                Scanner in = new Scanner(System.in);
                System.out.print("Nhap a: ");
                a = in.nextInt();
                System.out.print("Nhap b: ");
                b = in.nextInt();
                System.out.println("Tong hai so la " + (a + b));

            } catch (Exception e) {
                System.out.println("Nhap sai kieu du lieu . Yeu cau nhap lai ! ");
                check = false;
            }
        } while (!check);
    }
}
