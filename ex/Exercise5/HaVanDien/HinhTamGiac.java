/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_2;

import static java.lang.Math.*;

/**
 *
 * @author Admin
 */
public class HinhTamGiac {

    private int ma;
    private int mb;
    private int mc;
    private float cv;
    private float dt;

    /**
     * @return the ma
     */
    public int getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(int ma) {
        if(ma>0)
        this.ma = ma;
    }

    /**
     * @return the mb
     */
    public int getMb() {
        return mb;
    }

    /**
     * @param mb the mb to set
     */
    public void setMb(int mb) {
        if(mb>0)
        this.mb = mb;
    }

    /**
     * @return the mc
     */
    public int getMc() {
        return mc;
    }

    /**
     * @param mc the mc to set
     */
    public void setMc(int mc) {
        if(mc>0)
        this.mc = mc;
    }
    public void HinhTamGiac() {
        if ((ma < 0) || (mb < 0) || (mc < 0)) {
            this.ma = this.mb = this.mc = 0;
        } else if (((ma + mb) < mc) || ((ma + mc) < mb) || ((mb + mc) < ma)) {
            this.ma = this.mb = this.mc = 0;
        }

    }
    public void HinhTamGiac(int ma, int mb, int mc) {
        if ((ma < 0) || (mb < 0) || (mc < 0)) {
            this.ma = this.mb = this.mc = 0;
        } else if (((ma + mb) < mc) || ((ma + mc) < mb) || ((mb + mc) < ma)) {
            this.ma = this.mb = this.mc = 0;
        }
        else
        {
            this.ma=ma;
            this.mb=mb;
            this.mc=mc;
        }

    }
    public void Getchuvi(){
        cv=ma+mb+mc;
        System.out.println("Chu vi tam giac" +cv);
    }
    public void getDienTich(){
        dt=(float) (Math.sqrt((ma+mb+mc)*(ma+mb-mc)*(-ma+mb+mc)*(ma-mb+mc)))/4;
        System.out.println("Dien tich tam giac"+dt);
    }
        public boolean LaTamGiac() {
        boolean check;   
        if ((ma < 0) || (mb < 0) || (mc < 0)||((ma + mb) < mc) || ((ma + mc) < mb) || ((mb + mc) < ma)) {
            check=false;
            System.out.println("Khong la tam giac");
        }
        else
        {
            check=true;
            System.out.println("La Tam Giac");
        }
        return check;
    }
}
