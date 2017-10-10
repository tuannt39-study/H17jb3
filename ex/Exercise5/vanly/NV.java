/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part6OOP;

import java.util.ArrayList;

/**
 *
 * @author LilyEvans
 */
public class NV {

    private int MaNV;
    private String Hoten;
    private String DiaChi;
    private boolean CBQL;

    public NV(int MaNV, String Hoten, String DiaChi, boolean CBQL) {
        this.MaNV = MaNV;
        this.Hoten = Hoten;
        this.DiaChi = DiaChi;
        this.CBQL = CBQL;
    }

    public int getMaNV() {
        return MaNV;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public boolean isCBQL() {
        return CBQL;
    }

    public String toString() {
        return "Mã NV: " + this.getMaNV() + " tên: "+ this.getHoten() + " đ/c: " + this.getDiaChi();
    }
}

class testEx6 {

    public static void main(String[] args) {
        ArrayList<NV> NhanVien = new ArrayList<>();
        NV nv1 = new NV(123, "Lily1", "D4", true);
        NV nv2 = new NV(124, "Lily2", "D5", false);
        NV nv3 = new NV(123, "Lily1", "D4", true);
        NhanVien.add(nv1);
        NhanVien.add(nv2);
        NhanVien.add(nv3);
        for (int i = 0; i < NhanVien.size(); i++) {
            if (NhanVien.get(i).isCBQL()) System.out.println(NhanVien.get(i).toString());
        }

    }
}
