/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part6OOP;

/**
 *
 * @author LilyEvans
 */
public class HinhTamGiac {

    private int ma;
    private int mb;
    private int mc;

    public HinhTamGiac(int ma, int mb, int mc) {
        if (isTriangular(ma, mb, mc)) {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        } else {
            System.err.println("Invalid triangular!");
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        }
    }

    public HinhTamGiac() {
    }

    public int getMa() {
        return ma;
    }

    public int getMb() {
        return mb;
    }

    public int getMc() {
        return mc;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setMb(int mb) {
        this.mb = mb;
    }

    public void setMc(int mc) {
        this.mc = mc;
    }

    private boolean isTriangular(int ma, int mb, int mc) {
        return ma + mb > mc && ma + mc > mb && mb + mc > ma;
    }

    public int getChuVi() {
        return this.ma + this.mb + this.mc;
    }

    public double getDienTich() {
        int p = (ma + mb + mc)/2;
        return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
    }

    public static void main(String[] args) {
        HinhTamGiac a = new HinhTamGiac(1, 3, 4);
        System.out.println("P: " + a.getChuVi());
        System.out.println("S: " + a.getDienTich());
    }
}
