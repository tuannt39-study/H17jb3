/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haopv
 */
public class DanhSachNhanVienBai2 {
    private ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
    private int soluongnhanvien;
    private long tongLuong;

    
    public void add(NhanVien nv){
        dsnv.add(nv);
        this.tongLuong = tongLuong + nv.getLuong();
        this.soluongnhanvien = this.soluongnhanvien + 1;
        //this.soluongnhanvien = this.dsnv.size() + 1;
    }
    public void addFromType(){
        NhanVien nv = new NhanVien();
        System.out.println("Nhap Mã Nv:");
        Scanner sc = new Scanner(System.in);
        nv.setMaNv(sc.nextLine().toString());
        System.out.println("Nhap Số SP:");
        //sc = new Scanner(System.in);
        nv.setSoSP(sc.nextInt());
        
        this.add(nv);
    }
    public int spMin(){
        int min = this.dsnv.get(0).getSoSP();
        for (NhanVien nv: this.dsnv){
            if(min > nv.getSoSP()){
                min = nv.getSoSP();
            }
        }
        return min;
    }
    public long luongMax(){
        long max = this.dsnv.get(0).getLuong();
        for (NhanVien nv: this.dsnv){
            if(max < nv.getLuong()){
                max = nv.getLuong();
            }
        }
        return max;
    }
    
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
