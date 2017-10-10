/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Comparator;

public class NhanVien implements Comparable<NhanVien>, Comparator<NhanVien> {

    private String maNv;
    private int soSP;
    private long luong;
    
    public NhanVien(){
        
    }
    public NhanVien(String maNV,int soSP){
        this.maNv = maNV;
        this.soSP = soSP;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
    public void tinhLuong(){
        this.luong=soSP*5000;
    }
        public int compareTo(NhanVien o) {
        return this.soSP-o.getSoSP();
    }
    public String toString(){
        return "Mã NV: "+this.maNv+" SP: "+this.soSP+" Luong: "+luong+ "\n\r";
    }

    @Override
    public int compare(NhanVien t, NhanVien t1) {
                return t.getSoSP()-t1.getSoSP();

    }

    
}
