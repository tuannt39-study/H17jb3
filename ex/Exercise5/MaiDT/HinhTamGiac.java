/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class HinhTamGiac {

    /**
     * @param args the command line arguments
     */
    private int ma, mb, mc;
    private double chuVi;
    private double dienTich;
    private float p = (ma + mb + mc) / 2;

    public HinhTamGiac() {
        System.out.print("Nhập vào cạnh A = ");
        Scanner input = new Scanner(System.in);
        ma = input.nextInt();
        
       if(ma<0){System.out.println("Phải nhập số dương");}
        System.out.print("Nhập vào cạnh B = ");
        mb = input.nextInt();
        System.out.print("Nhập vào cạnh C = ");
        mc = input.nextInt();
        if (laTamGiac(ma, mb, mc)) {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
            this.chuVi = this.ma + this.mb + this.mc;
            this.dienTich = Math.sqrt(p * (p - this.ma) * (p - this.mb) * (p - this.mc));
            System.out.println("Chu vi hinh tam giac:"+this.chuVi);
            System.out.println("Dien tich hinh tam giac:"+this.dienTich);
        } else {
            System.out.println("Không phải là tam giác!");
        }

    }

    ;
    public HinhTamGiac(int ma, int mb, int mc) {
        if (laTamGiac(ma, mb, mc)) {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
            this.chuVi = this.ma + this.mb + this.mc;
            this.dienTich = Math.sqrt(p * (p - this.ma) * (p - this.mb) * (p - this.mc));
            System.out.println("Chu vi hinh tam giac:"+this.chuVi);
            System.out.println("Dien tich hinh tam giac:"+this.dienTich);
        } else {
            System.out.println("Không phải là tam giác!");
        }

    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        if (ma > 0) {
            this.ma = ma;
        } else {
            this.ma = 0;
        }
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        if (mb > 0) {
            this.mb = mb;
        } else {
            this.mb = mb;
        }
    }

    public int getMc() {
        return mc;
    }

    public void setMc(int mc) {
        if (mc > 0) {
            this.mc = mc;
        } else {
            this.mc = mc;
        }
    }

    public double getChuVi() {
        return chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public boolean laTamGiac(int ma, int mb, int mc) {
        if (ma > 0 && mb > 0 && mc > 0
                && (ma + mb > mc || ma + mc > mb || mb + mc > ma)) {
            return true;
        } else {
            return false;
        }
    }

}
