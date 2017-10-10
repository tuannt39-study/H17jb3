/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author LENOVO
 */
public class SinhVien {

    private String maSV;
    private String HoTen;
    private double DiemTH;
    private double DiemLT;

    public SinhVien(String maSV, String HoTen, double DiemTH, double DiemLT) {
        this.maSV = maSV;
        this.HoTen = HoTen;
        this.DiemTH = DiemTH;
        this.DiemLT = DiemLT;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public double getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(double DiemTH) {
        this.DiemTH = DiemTH;
    }

    public double getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(double DiemLT) {
        this.DiemLT = DiemLT;
    }

    public double DiemTB() {
        double a = (this.DiemLT + this.DiemTH) / 2;
        return a;
    }

    public String XepLoai() {
        String temp = "";
        if (DiemTB() < 5) {
            temp = "Tach. ";
        } else {
            temp = "Dau. ";
        }
        return temp;
    }
}

