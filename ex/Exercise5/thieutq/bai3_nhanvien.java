/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai3_nhanvien {
    private String maNV;
    private int soSP;
    private String TongKet;
    private long luong;
    int n;

    public long getLuong() {
        if (coVuotChuan()) {
            return (500 * 20000 + (this.soSP - 500) * 30000);
        } else {
            return (20000 * this.soSP);
        }
    }   

    public void nhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP > 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    public boolean coVuotChuan() {
        if (soSP > 500) {
            return true;
        } else {
            return false;
        }
    }

    public String getTongKet() {
        if (coVuotChuan()) {         
            return "Vuot";
        }
        return "";
    }

    public void XuatTieuDe() {
    }

    ;
    public String toString() {
        return "Ma NV:" + this.maNV + " So SP:" + this.soSP + " Luong:" + this.getLuong() + " Tong Ket:" + this.getTongKet();
    }

    public void addFromType(){
    Scanner input= new Scanner(System.in);
        System.out.print("Nhap ma NV:");
        maNV=input.nextLine();
        System.out.print("Nhap  so SP:");
        soSP=input.nextInt();
        
        
    }
}
