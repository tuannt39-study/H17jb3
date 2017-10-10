/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author viet
 */
public class SinhVien {

    private int maSV;
    private String hotenSV;
    private float diemLyThuyet;
    private float diemThucHanh;

    public SinhVien() {

    }

    public SinhVien(int maSV, String hotenSV, float diemLyThuyet, float diemThucHanh) {
        this.maSV = maSV;
        this.hotenSV = hotenSV;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHotenSV() {
        return hotenSV;
    }

    public void setHotenSV(String hotenSV) {
        this.hotenSV = hotenSV;
    }

    public float getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(float diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public float getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(float diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hotenSV=" + hotenSV + ", diemLyThuyet=" + diemLyThuyet + ", diemThucHanh=" + diemThucHanh + '}';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maSV;
        String hotenSV;
        float diemLyThuyet;
        float diemThucHanh;
        ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
        char ask = 'Y';
        while (ask == 'Y') {
            System.out.print("Ma sinh vien : ");
            maSV = in.nextInt();
            System.out.print("Ho ten sinh vien : ");
            hotenSV = in.nextLine();
            System.out.print("Diem ly thuyet : ");
            diemLyThuyet = in.nextFloat();
            System.out.print("Diem thuc hanh : ");
            diemThucHanh = in.nextFloat();
            SinhVien s = new SinhVien(maSV, hotenSV, diemLyThuyet, diemThucHanh);
            sv.add(s);
            System.out.print("Them sinh vien ( Y or N ) : ");
            ask = in.nextLine().charAt(0);
        }
        //

        System.out.println("Thong tin sinh vien");
        sv.toString();
    }
}
