/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4Collection;

import java.util.Comparator;

/**
 *
 * @author ThaoJ
 */
public class NhanVien implements Comparable<NhanVien>, Comparator<NhanVien>{
    private String maNV;
    private String tenNV;
    private int soSP;
    private int luong;

        
    public NhanVien() {
        
    }
    
    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); 
    }

    @Override
    public int compareTo(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compare(NhanVien t, NhanVien t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

