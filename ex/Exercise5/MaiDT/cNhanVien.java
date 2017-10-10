/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class cNhanVien {

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

    public int getmSoSp() {
        return mSoSp;
    }

    /**
     * @param args the command line arguments
     */
    public void setmSoSp(int mSoSp) {
        if (mSoSp > 0) {
            this.mSoSp = mSoSp;
        } else {
            mSoSp = 0;
        }

    }

    private String mHo, mTen;
    private int mSoSp;
    private float luong;

    public float getLuong() {
        if (this.mSoSp >= 1 && this.mSoSp <= 199) {
            this.luong = (float) (this.mSoSp * 0.5);
        } else if (this.mSoSp >= 200 && this.mSoSp <= 399) {
            this.luong = (float) (this.mSoSp * 0.55);
        } else if (this.mSoSp >= 400 && this.mSoSp <= 599) {
            this.luong = (float) (this.mSoSp * 0.6);
        } else {
            this.luong = (float) (this.mSoSp * 0.65);
        }
        return this.luong;
    }

    public cNhanVien() {
    }

    ;
   public cNhanVien(String mHo, String mTen, int mSoSP) {
        this.mHo = mHo;
        this.mTen = mTen;
        if (mSoSp >= 0) {
            this.mSoSp = mSoSp;
        } else {
            this.mSoSp = 0;
        }
    }

    public  boolean NhieuHon(cNhanVien nv2) {
       
        if (this.getmSoSp() >  nv2.getmSoSp()) {
            return true;
        } else {
            return false;
        }
    }
}
