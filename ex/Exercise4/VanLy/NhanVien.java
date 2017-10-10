/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author LilyEvans
 */
public class NhanVien implements Comparable<NhanVien>, Comparator<NhanVien>{

    private String maNV;
    private String tenNV;
    private int soSP;
    private long luong;

    public NhanVien(String maNV, String tenNV, int soSP, long luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.soSP = soSP;
        this.luong = luong;
    }

    public NhanVien() {
    }

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public NhanVien(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public long getLuong() {
        return luong;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Nhân viên mã " + this.maNV + "  tên: " + this.tenNV + " số sp " + this.soSP + " lương: " + this.luong;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof NhanVien) && (this.maNV.equals(((NhanVien) obj).maNV));
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.soSP - o.getSoSP();
    }

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return o1.getSoSP() - o2.getSoSP();
    }
    
}
