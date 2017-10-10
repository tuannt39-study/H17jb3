/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author LENOVO
 */
public class NhanVien {
    private String maNV;
    private String tenNV;
    private int soSP;
    private long luong;
public NhanVien(String tenNV, String maNV, int soSP, long luong){
    this.tenNV = tenNV;
    this.maNV = maNV;
    this.soSP = soSP;
    this.luong = luong;
            
}
    public String getMaNV(){
        return this.maNV;
    }
    public String getTenNV(){
        return this.tenNV;
    }
    public int getSoSP(){
        return this.soSP;
    }
    public long getLuong(){
        return this.luong;
    }
    public void setMaNV(String maNV){
     this.maNV = maNV;   
    }
    public void setTenNV(String tenNV){
      this.tenNV = tenNV;   
    }
    public void setSoSP(int soSP){
        this.soSP = soSP;
    }
    public void setLuong(long luong){
        this.luong = luong;
    }
    @Override
    public String toString() {
        return  maNV + " " + " " + " " + " " + " "+ tenNV + " " + " " + " " + " " + " " + soSP + " " + " " + " " + " " + " " + luong ;
    } 
}
    
