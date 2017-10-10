/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import static exercise5.NhanVien.xuatTieuDe;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author LENOVO
 */
public class NhanVienApp {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String maso;
        int sosp;
        System.out.println("Nhan vien 1: Nhap Maso va So sp");
        maso = input.nextLine();
        sosp = input.nextInt();
        NhanVien nv1 = new NhanVien(maso, sosp);
        System.out.println("Nhan vien 2: Nhap Maso va So sp");
        maso = sc.nextLine();
        sosp = sc.nextInt();
        NhanVien nv2 = new NhanVien(maso, sosp);
        xuatTieuDe();
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}
