/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.*;

/**
 *
 * @author Admin
 */
public class nhanvien {

    private String manv;
    private String tennv;
    private int sosp;
    private long luong;

    public nhanvien(String manv, String tennv, int sosp, long luong) {
        this.manv = manv;
        this.tennv = tennv;
        this.sosp = sosp;
        this.luong = luong;
    }

    public String getten()
    {
     return this.tennv;   
    }
    public String getma()
    {
        return this.manv;
    }
    public int getsosp()
    {
        return this.sosp;
    }
    public long getluong()
    {
        return this.luong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nhan vien");
        int n = sc.nextInt();
            nhanvien[] m = new nhanvien[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhan vien thu: " + (i + 1));
                System.out.println("Nhap vao ma nhan vien");
                String manv = sc.next();
                System.out.println("Nhap vao ten nhan vien");
                String tennv = sc.next();
                System.out.println("Nhap vao so san pham");
                int sosp = sc.nextInt();
                System.out.println("Nhap vao luong nhan vien");
                long luong = sc.nextLong();
            }

    }

}
