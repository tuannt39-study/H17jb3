/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;

import java.util.ArrayList;

/**
 *
 * @author haopv
 */
public class DanhSachNhanVien {
    private ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
    private int soluongnhanvien;
    private long tongLuong;

    
    public void add(NhanVien nv){
        dsnv.add(nv);
        this.tongLuong = tongLuong + nv.getLuong();
        this.soluongnhanvien = this.soluongnhanvien + 1;
        //this.soluongnhanvien = this.dsnv.size() + 1;
    }
    //public int get
    
    public void show(){
        for (NhanVien nv: this.dsnv){
            nv.show();
        }
        System.out.println("Số lượng nv: "+ this.soluongnhanvien);
        System.out.println("Lương: "+ this.tongLuong);
    }
    
    public ArrayList<NhanVien> getDsnv() {
        return dsnv;
    }

    public void setDsnv(ArrayList<NhanVien> dsnv) {
        this.dsnv = dsnv;
    }

    public int getSoluongnhanvien() {
        return soluongnhanvien;
    }

    public void setSoluongnhanvien(int soluongnhanvien) {
        this.soluongnhanvien = soluongnhanvien;
    }

    public long getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(long tongLuong) {
        this.tongLuong = tongLuong;
    }
    
    
}
