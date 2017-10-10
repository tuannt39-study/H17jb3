/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;


/**
 *
 * @author LilyEvans
 */
public class NVapp {

    public static void main(String[] args) {
        DanhSachNhanVien DS = DanhSachNhanVien.getDSNV();
        System.out.print("Nhập số nv: ");
        Scanner sc = new Scanner(System.in);
          int count = sc.nextInt();
        for (int i = 0; i <count; i++) {
           DS.add(new NhanVien());
        }
    }
}
