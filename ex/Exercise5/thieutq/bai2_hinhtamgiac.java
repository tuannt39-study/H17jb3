/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai2_hinhtamgiac {
    private int ma,mb,mc;

    private float chuvi;
    private double dientich;
    
    private float p = (ma + mb + mc)/2;
    public int getma() {
        return ma;
    }

    public void setma(int ma) {
        if (ma>0){
        this.ma = ma;}else this.ma=0;
    }

    public int getmb() {

        return mb;
    }

    public void setmb(int mb) {
        if (mb>0){
        this.mb = mb;}else this.mb=0;
    }

    public int getmc() {
        return mc;
    }

    public void setmc(int mc) {
        if (mc>0){
        this.mc = mc;}else this.mc=0;
    }
   public void  HinhTamGiac(int ma, int mb, int mc) {
        if (laTamGiac(ma,mb,mc)){
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }else System.out.println("Khong Phai Hinh Tam Giac");
    }
   public boolean laTamGiac(int ma, int mb, int mc) {
        if ((ma > 0) || (mb > 0) || (mc > 0)
                || ((ma + mb) > mc) || ((ma + mc) > mb) || ((mb + mc) > ma)) {
            return true;
        } else {
            return false;
        }
    }
    public void Getchuvi(){
        chuvi=ma+mb+mc;
        System.out.println("Chu vi tam giac" +chuvi);
    }
    public void getDienTich(){
        dientich= (Math.sqrt(p*(p-ma)*(p-mc)*(p-mb)));
        System.out.println("Dien tich tam giac"+dientich);
    
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ma, mb, mc;
		System.out.print("Canh A=");
		ma=sc.nextInt();
		System.out.print("Canh B=");
		mb=sc.nextInt();
		System.out.print("Canh C=");
		mc=sc.nextInt();
		bai2_hinhtamgiac tg = new bai2_hinhtamgiac();
		tg.setma(ma);
		tg.setmb(mb);
		tg.setmc(mc);
		if (ma<=0 || mb<=0 || mc<=0 ) {
			System.out.println("-Khong phai hinh tam giac");
		} else {
			if (tg.laTamGiac()==false){
				System.out.println("--Khong phai hinh tam giac");
			} else {
				System.out.println("La hinh tam giac");
				tg.Getchuvi();
				tg.getDienTich();
			}
		}
		
		bai2_hinhtamgiac tg2 = new bai2_hinhtamgiac();
		boolean t=tg2.laTamGiac(3,4,5);
		if (t==false){
			System.out.println("--Khong phai hinh tam giac 2");
		} else {
			System.out.println("La hinh tam giac 2");
			tg.Getchuvi();
			tg.getDienTich();
		}
	}
}
