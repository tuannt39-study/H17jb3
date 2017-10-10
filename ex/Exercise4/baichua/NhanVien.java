/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;

/**
 *
 * @author haopv
 */
public class NhanVien {
    /*
    - maNV : String
- tenNV: String
- soSP : int
- luong: long
    */
    private String maNv;
    private String tenNv;
    private int soSP;
    private long luong;
    
    NhanVien(){
        
    }
    NhanVien(String maNV,int soSP){
        this.maNv = maNV;
        this.soSP = soSP;
    }
    NhanVien(String maNV,String tenNV,int soSP){
        this.maNv = maNV;
        this.tenNv = tenNV;
        this.soSP = soSP;
    }
    NhanVien(String maNV,int soSP,String tenNV){
        this.maNv = maNV;
        this.tenNv = tenNV;
        this.soSP = soSP;
    }
    public NhanVien(String maNV,String tenNV,int soSP, long luong){
        this.maNv = maNV;
        this.tenNv = tenNV;
        this.soSP = soSP;
        this.luong = luong;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
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
    
    public void show(){
        System.out.println("Mã NV: "+this.maNv+" Tên: "+ this.tenNv+" SP: "+this.soSP+" Luong: "+luong);
    }
    
}
