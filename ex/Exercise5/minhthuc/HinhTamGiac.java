package Excersice_5;

/**
 * Created by minht on 5/4/2017.
 */
public class HinhTamGiac {
    private int ma,mb,mc;
    private float p = (ma+mb+mc)/2;
    public HinhTamGiac() {
    }

    public HinhTamGiac(int ma, int mb, int mc) {
        if (isTamGiac(ma,mb,mc)){
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }else System.out.println("Khong Phai Hinh Tam Giac");
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        if (ma>0){
        this.ma = ma;}else this.ma=0;
    }

    public int getMb() {

        return mb;
    }

    public void setMb(int mb) {
        if (mb>0){
        this.mb = mb;}else this.mb=0;
    }

    public int getMc() {
        return mc;
    }

    public void setMc(int mc) {
        if (mc>0){
        this.mc = mc;}else this.mc=0;
    }
    public boolean isTamGiac(int ma, int mb, int mc){
        if (ma>0&&mb>0&&mc>0&&
                (
                        (((ma+mb)>mc)||
                                ((mc+ma)>mb))||
                ((mb+mc)>ma))
                ) {
            return true;
        }else return false;
    }
    public int getChuvi(){
        return this.mc+this.ma+this.mb;
    }
    public double getDienTich(){
        return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
    }
}
