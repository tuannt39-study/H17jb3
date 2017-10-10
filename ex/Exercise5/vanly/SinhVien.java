/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part6OOP;

/**
 *
 * @author LilyEvans
 */
public class SinhVien {

    private int maSV;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public SinhVien(int maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public double getDiemTB() {
        return (this.diemLT + this.diemTH) / 2;
    }

    public String getResult() {
        if (this.getDiemTB() > 5) {
            return "pass";
        } else {
            return "fail";
        }
    }

    public String result() {
        return "Mã SV: " + this.getMaSV() + ". Họ và tên: " + this.getHoTen() + ", result: " + this.getResult();
    }
}
class test {
    public static void main(String[] args) {
        SinhVien a = new SinhVien(1401040127, "Lily", 4, 6 );
        System.out.println(a.result());
    }
}