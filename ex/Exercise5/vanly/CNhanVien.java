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
public class CNhanVien {

    private String mHo;
    private String mTen;
    private int mSoSP;

    public CNhanVien(String mHo, String mTen, int mSoSP) {
        this.mHo = mHo;
        this.mTen = mTen;
        if (mSoSP > 0) {
            this.mSoSP = mSoSP;
        } else {
            this.mSoSP = 0;
        }
    }

    public String getmHo() {
        return mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public void setmSoSP(int mSoSP) {
        if (mSoSP > 0) {
            this.mSoSP = mSoSP;
        } else {
            this.mSoSP = 0;
        }
    }

    public double getLuong() {
        int soSp = this.mSoSP;
        if (soSp < 200) {
            return soSp * 0.5;
        } else if (soSp < 400) {
            return 199 * 0.5 + (soSp - 199) * 0.55;
        } else if (soSp < 600) {
            return 199 * 0.5 + 200 * 0.55 + (soSp - 199 * 2 - 1) * 0.6;
        } else {
            return 199 * 0.5 + 200 * 0.55 + 200 * 0.6 + (soSp - 199 * 3 - 2) * 0.65;
        }
    }

    public boolean NhienHon(CNhanVien nv2) {
        return this.mSoSP > nv2.mSoSP;
    }

    public static void main(String[] args) {
        CNhanVien a = new CNhanVien("Evans", "Lily", 640);
        System.out.println(a.getLuong());
    }
}
