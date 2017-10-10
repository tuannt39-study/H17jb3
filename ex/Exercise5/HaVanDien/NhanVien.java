/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private String MaNv;
    private int SoSp;

    /**
     * @return the MaNv
     */
    public String getMaNv() {
        return MaNv;
    }

    /**
     * @param MaNv the MaNv to set
     */
    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    /**
     * @return the SoSp
     */
    public int getSoSp() {
        return SoSp;
    }

    /**
     * @param SoSp the SoSp to set
     */
    public void setSoSp(int SoSp) {
        if (SoSp > 0) {
            this.SoSp = SoSp;
        } else {
            this.SoSp = 0;
        }
    }

    public boolean CoVuotChuan() {
        if (SoSp > 500) {
            return true;
        } else {
            return false;
        }

    }

    public void getLuong() {
        if (CoVuotChuan()) {
            System.out.println("Luong:" + (500 * 20000 + (this.SoSp - 500) * 30000));
            //return (500 * 20000 + (this.SoSp - 500) * 30000);
        } else {
            System.out.println("Luong" + (20000 * this.SoSp));
        }
    }

    public void getTongKet() {
        if (CoVuotChuan()) {
            System.out.println("Vuot");
        }
    }

    public void addFromType() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào ma NV:");
        MaNv = input.nextLine();
        System.out.print("Nhập vào so SP:");
        SoSp = input.nextInt();

    }

}
