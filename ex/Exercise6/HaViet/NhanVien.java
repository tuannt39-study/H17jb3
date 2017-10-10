/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

/**
 *
 * @author viet
 */
public class NhanVien {

    private String maNV;
    private int soSP;

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

    public int setSoSP() {
        return soSP;
    }

    public void getSoSP(int soSP) {
        this.soSP = soSP;
    }

    public boolean coVuotChuan() {
        return (this.soSP > 500);
    }

    public String getTongKet() {
        return coVuotChuan() ? "Vuot" : "";
    }

    public double getLuong() {
        if (!coVuotChuan()) {
            return this.soSP * 20000;
        } else {
            return 500 * 20000 + (this.soSP - 500) * 30000;
        }
    }

    public void XuatTieuDe() {
        System.out.println("Tieu de: " + "\nMa nhan vien: " + maNV + "\nSo san pham: " + soSP + "\nLuong: " + getLuong() + "\nTong ket: " + getTongKet());
    }

}
