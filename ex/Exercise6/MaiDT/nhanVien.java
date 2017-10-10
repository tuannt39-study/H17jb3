/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_2;

import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class nhanVien {

    /**
     * @param args the command line arguments
     */
    private String maNV;
    private int soSP;
    private String tongKet;
    private long luong;
   // int n;

    public long getLuong() {
        if (coVuotChuan()) {
            return (500 * 20000 + (this.soSP - 500) * 30000);
        } else {
            return (20000 * this.soSP);
        }
    }

    public nhanVien() {
 
    }

    public nhanVien(String maNV, int soSP) {
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
            //System.out.println("Vượt!");
            return "Vượt";
        }
        return "";
    }

    public void XuatTieuDe() {
    }

    ;
    public String toString() {
        return "Ma NV:" + this.maNV + "\t|Số SP:" + this.soSP + "\t|Lương:" + this.getLuong() + "\t|Tổng kết:" + this.getTongKet();
    }

    public void addFromType(){
    Scanner input= new Scanner(System.in);
        System.out.print("Nhập vào ma NV:");
        maNV=input.nextLine();
        System.out.print("Nhập vào so SP:");
        soSP=input.nextInt();
        
        
    }
}
