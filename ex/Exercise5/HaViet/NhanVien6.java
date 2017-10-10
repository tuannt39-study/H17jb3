/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author viet
 */
public class NhanVien6 {
    private int maNV;
    private String hoTen;
    private String diaChi;
    private boolean cbQL;

    public NhanVien6() {
    }

    public NhanVien6(int maNV, String hoTen, String diaChi, boolean cbQL) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.cbQL = cbQL;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isCbQL() {
        return cbQL;
    }

    public void setCbQL(boolean cbQL) {
        this.cbQL = cbQL;
    }
    
    public static void main(String[] args) {
        
    }
}
