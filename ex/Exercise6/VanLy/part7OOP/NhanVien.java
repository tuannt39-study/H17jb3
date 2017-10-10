/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part7OOP;

import part6OOP.TableRender;

/**
 *
 * @author LilyEvans
 */
public class NhanVien {

    private String maNV;
    private int soSP;
    private final int CHI_TIEU = 500;

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public NhanVien() {
    }


    public String getMaNV() {
        return maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public boolean coVuotChuan() {
        return this.soSP > CHI_TIEU;
    }

    public String getTongKet() {
        if (this.coVuotChuan()) {
            return "Vượt";
        } else {
            return null;
        }
    }

    public double getLuong() {
        if (!this.coVuotChuan()) {
            return this.soSP * 20000;
        } else {
            return 500 * 20000 + (this.getSoSP() - 500) * 30000;
        }
    }

    public static void xuatTieuDe() {
        TableRender tableRender = new TableRender(5, 20, 30, 30, 10);
        System.out.println(tableRender.RenderHeader("DANH SÁCH NHÂN VIÊN"));
    }

    @Override
    public String toString() {
        return this.maNV + " " + " Số sp: " + this.getSoSP() + " lương: " + this.getLuong() + " tổng kết: " + getTongKet();
    }
}
