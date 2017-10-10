/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author LilyEvans
 */
public class DanhSachNhanVien extends ArrayList<NhanVien> {

    private static DanhSachNhanVien dsnv = new DanhSachNhanVien();

    private DanhSachNhanVien() {
    }

    public static synchronized DanhSachNhanVien getDSNV() {
        if (dsnv == null) {
            dsnv = new DanhSachNhanVien();
        }
        return dsnv;
    }

    public void addNV(NhanVien nv) {
        dsnv.add(nv);
    }

    public void removeNV(int pos) {
        dsnv.remove(pos);
    }

    public int sizeDS() {
        return dsnv.size();
    }

    public long tongLuong() {
        long result = 0;
        for (int i = 0; i < dsnv.sizeDS(); i++) {
            result += dsnv.get(i).getLuong();
        }
        return result;
    }

    public ArrayList<NhanVien> minSP() {
        ArrayList<NhanVien> result = new ArrayList<NhanVien>();
        long min = 0;
        for (int i = 0; i < dsnv.size(); i++) {
            if (min >= dsnv.get(i).getSoSP()) {
                min = dsnv.get(i).getSoSP();
            }
        }
        for (int i = 0; i < dsnv.sizeDS(); i++) {
            if (min == dsnv.get(i).getSoSP()) {
                result.add(dsnv.get(i));
            }
        }
        return result;
    }

    public ArrayList<NhanVien> maxLuong() {
        ArrayList<NhanVien> result = new ArrayList<NhanVien>();
        long max = 0;
        for (int i = 0; i < dsnv.size(); i++) {
            if (max >= dsnv.get(i).getLuong()) {
                max = dsnv.get(i).getLuong();
            }
        }
        for (int i = 0; i < dsnv.sizeDS(); i++) {
            if (max == dsnv.get(i).getLuong()) {
                result.add(dsnv.get(i));
            }
        }
        return result;
    }

    public NhanVien search(String maNv) {
        for (int i = 0; i < dsnv.sizeDS(); i++) {
            if (maNv.equalsIgnoreCase(dsnv.get(i).getMaNV())) {
                return dsnv.get(i);
            }
        }
        return null;
    }

    private ArrayList<NhanVien> SortSoSanPham(ArrayList<NhanVien> dsnv) {
        ArrayList<NhanVien> result = dsnv;
        Collections.sort(result, new NhanVien());
        return result;
    }
}
