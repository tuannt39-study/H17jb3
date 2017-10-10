/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_tuannv;

import java.util.Scanner;

/**
 *
 * @author TUAN
 */
public class CNhanVien {
    private String mHo;
    private String mTen;
    private int mSoSP;

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
    
    public CNhanVien(){
        
    }
    
    public CNhanVien(String Ho, String Ten, int SP){
        if(SP>0){
            this.mSoSP = SP;
        }else{
            this.mSoSP = 0;
        }
        this.mHo = Ho;
        this.mTen = Ten;
    }
    
    public long getLuong(){
        long L=0;
        if(this.mSoSP>=1 && this.mSoSP<=199){
            L=(long) (this.mSoSP*0.5);
        }else if(this.mSoSP>=200 && this.mSoSP<=399){
            L=(long) (this.mSoSP*0.55);
        }else if(this.mSoSP>=400 && this.mSoSP<=599){
            L=(long) (this.mSoSP*0.6);
        }else{
            L=(long) (this.mSoSP*0.65);
        }
        return L;
    }
    
    public boolean NhieuHon(CNhanVien nv2){
        if(this.mSoSP>nv2.mSoSP){
            return true;
        }else{
            return false;
        }
    }
    
    public void Input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ho NV: ");
        this.setmHo(sc.nextLine());
        System.out.println("nhap ten NV: ");
        this.setmTen(sc.nextLine());
        System.out.println("Nhap so SP: ");
        this.setmSoSP(sc.nextInt());
    }

    @Override
    public String toString() {
        return "\nHo va Ten: " + this.getmHo() + " " + this.getmTen()+ "\n" + "So San Pham: " +this.mSoSP + "\n" + "Luong: " + this.getLuong();
    }
    
     public void Output(){
        System.out.println(this.toString());
    }
}