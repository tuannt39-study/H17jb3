/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.Scanner;

/**
 *
 * @author viet
 */
public class Bai8 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IllegalTriangleException {
        int ma, mb, mc;
        System.out.print("Nhap canh a : ");
        ma = in.nextInt();
        System.out.print("Nhap canh b : ");
        mb = in.nextInt();
        System.out.print("Nhap canh c : ");
        mc = in.nextInt();

        HinhTamGiac recTamGiac = new HinhTamGiac(ma, mb, mc);
        try {
            if (recTamGiac.laTamGiac()) {                     
                System.out.println("Chu vi : " + recTamGiac.getChuVi());
                System.out.println("Dien tich : " + recTamGiac.getDienTich());
            }
            else
            {
                throw new IllegalTriangleException();
            }
        } catch (IllegalTriangleException e)  {
            System.out.println(e.getClass());
        }
    }

}
