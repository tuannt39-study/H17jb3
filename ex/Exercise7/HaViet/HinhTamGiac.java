/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.Scanner;

/**
 *
 * @author viet
 */
public class HinhTamGiac {

    private int ma;
    private int mb;
    private int mc;

    public HinhTamGiac() {
    }

    public HinhTamGiac(int ma, int mb, int mc) throws IllegalTriangleException {

        if (ma < 0 || mb < 0 || mc < 0) {
            this.ma = this.mb = this.mc = 0;
        } else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    public int getCanhA() {
        return this.ma;
    }

    public void setCanhA(int ca) {
        if (ca > 0) {
            this.ma = ca;
        }
    }

    public int getCanhB() {
        return this.mb;
    }

    public void setCanhB(int cb) {
        if (cb > 0) {
            this.mb = cb;
        }
    }

    public int getCanhC() {
        return this.mc;
    }

    public void setCanhC(int cc) {
        if (cc > 0) {
            this.mc = cc;
        }
    }

    public boolean laTamGiac() {

        return (mb + mc > ma) && (ma + mc > mb) && (ma + mb > mc);
    }

    public int getChuVi() {
        return ma + mb + mc;
    }

    public double getDienTich() {
        return Math.sqrt((getChuVi() / 2) * (getChuVi() - ma) * (getChuVi() - mb) * (getChuVi() - mc));
    }

}

class IllegalTriangleException extends Exception {

    public IllegalTriangleException() {
        System.out.println("Nhap sai roi");
    }
}
