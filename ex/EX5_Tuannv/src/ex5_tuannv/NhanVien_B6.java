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
public class NhanVien_B6 {
    private int maNV;
    private String HoTen;
    private String DC;
    private boolean CBQL;

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public boolean isCBQL() {
        return CBQL;
    }

    public  void setCBQL(boolean CBQL) {
        this.CBQL = CBQL;
    }
    
    NhanVien_B6(){
        
    }
   
    NhanVien_B6(int ma, String hoTen, String diaChi, boolean cbql){
        this.maNV = ma;
        this.HoTen = hoTen;
        this.DC = diaChi;
        this.CBQL = cbql;
    }
    
    @Override
    public String toString() {
        return "\nMa NV: " + this.getMaNV() + "\tHo va Ten: " + this.getHoTen() + "\tDia chi: " + this.getDC();
    }
    
    public void Output(){
            System.out.println(toString());
        }
}