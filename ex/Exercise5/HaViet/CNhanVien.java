/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.ArrayList;

/**
 *
 * @author viet
 */
public class CNhanVien {

    private String mHo;
    private String mTen;
    private int mSoSP;

    public CNhanVien() {

    }

    public CNhanVien(String mHo, String mTen, int mSoSP) {
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }

    public double getLuong() {
        double luong = 0;
        if (mSoSP >= 1 && mSoSP < 199) {
            luong = mSoSP * 0.5;
        }
        if (mSoSP >= 200 && mSoSP < 399) {
            luong = mSoSP * 0.55;
        }
        if (mSoSP >= 400 && mSoSP < 599) {
            luong = mSoSP * 0.6;
        }
        if (mSoSP >= 600) {
            luong = mSoSP * 0.65;
        }
        return luong;
    }

    public boolean NhieuHon(CNhanVien nv2) {
        return (this.getmSoSP() > nv2.getmSoSP());
    }
    
    public static void main(String[] args) {
        CNhanVien nv1 = new CNhanVien("Ha", "Viet", 400);
        CNhanVien nv2 = new CNhanVien("Tuan", "Anh", 600);
        System.out.println("Nhan vien " + nv1.mHo + " " + nv1.mTen + " co " + nv1.getmSoSP() + " nhan duoc " + nv1.getLuong() + " dong");
        System.out.println("Nhan vien " + nv2.mHo + " " + nv2.mTen + " co " + nv2.getmSoSP() + " nhan duoc " + nv2.getLuong() + " dong");
        if ( nv1.getmSoSP() > nv2.getmSoSP()) {
            System.out.println("Nhan vien 1 nhieu hon nhan vien 2 "+(nv1.getmSoSP() - nv2.getmSoSP())+" san pham");
        }
        else
            System.out.println("Nhan vien 1 it hon nhan vien 2 "+(nv2.getmSoSP() - nv1.getmSoSP())+" san pham");
            
    }
    
}
