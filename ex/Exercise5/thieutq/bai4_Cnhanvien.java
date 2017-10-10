/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author Admin
 */
public class bai4_Cnhanvien {
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
    
   public void Cnhanvien(String mHo, String mTen, int mSoSP) {
        this.mHo = mHo;
        this.mTen = mTen;
        if (mSoSp >= 0) {
            this.mSoSp = mSoSp;
        } else {
            this.mSoSp = 0;
        }
    }

    public  boolean NhieuHon(bai4_Cnhanvien nv) {
       
        if (this.getmSoSp() >  nv.getmSoSp()) {
            return true;
        } else {
            return false;
        }
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

    public int getmSoSp() {
        return mSoSp;
    }
    
    public void setmSoSp(int mSoSp) {
        if (mSoSp > 0) {
            this.mSoSp = mSoSp;
        } else {
            mSoSp = 0;
        }

    }
    public static void main(String[] args) {
		bai4_Cnhanvien nv1 = new bai4_Cnhanvien();
		nv1.setmHo("Truong");
		nv1.setmTen("Thieu");
		nv1.setmSoSp(300);
		double luong=nv1.getLuong();
		System.out.println("Luong nv1=" + luong);
		bai4_Cnhanvien nv2 = new bai4_Cnhanvien();
		nv2.setmHo("Quang");
		nv2.setmTen("Thieu");
		nv2.setmSoSp(500);
		double luong2=nv2.getLuong();
		System.out.println("Luong nv2=" + luong2);
		
		bai4_Cnhanvien nv = new bai4_Cnhanvien();
		System.out.println("Dung ham nhieu hon");
		if (nv.NhieuHon()==true){
			System.out.println("nv 1 > nv 2");
		} else System.out.println("nv 1 < nv 2");
		System.out.println("Ko dung");
		if (nv1.getmSoSp()>nv2.getmSoSp()){
			System.out.println("nv 1 > nv 2");
		} else System.out.println("nv 1 < nv 2");
	}
}
