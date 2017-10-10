/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SinhVienApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten Sinh Vien: ");
        String name = sc.nextLine();
        System.out.println("Nhap ma SV: ");
        String ma = input.nextLine();
        System.out.println("Nhap diem LT: ");
        double LT = sc.nextDouble();
        System.out.println("Nhap diem TH: ");
        double TH = input.nextDouble();
        SinhVien a = new SinhVien(ma, name, TH, LT);
        System.out.println("Diem TB cua sinh vien nay la: " +a.DiemTB());
        System.out.println("Co qua hay khong? " +a.XepLoai());
    }
}
