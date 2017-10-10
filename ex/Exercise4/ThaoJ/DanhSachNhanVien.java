/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4Collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ThaoJ
 */
public class DanhSachNhanVien extends ArrayList<NhanVien>{

    public DanhSachNhanVien() {
    }
    
    public void addNV( NhanVien a){
        this.add(a);
    }
    
    public int soNV(){
        return this.size();
    }
    
    public int TongLuongNV(){
        int luong = 0;
        for (NhanVien thi : this) {
            luong = luong + thi.getLuong();    
        }
        return luong;
    }
    
}
