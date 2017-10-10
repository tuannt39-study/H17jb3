/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_tuannv;

/**
 *
 * @author TUAN
 */
public class HinhTamGiac {
    private int ma, mb, mc;
    
    public HinhTamGiac() {
    }
    public HinhTamGiac(int a, int b, int c){
       if(a+b>c && a+c>b && b+c>a && a>0 && b>0 && c>0){
            this.ma=a;
            this.mb=b;
            this.mc=c;
       }else{
            this.ma=0;
            this.mb=0;
            this.mc=0;
       }
    }
    
    public boolean laTamGiac(){
        if(ma+mb>mc && ma+mc>mb && mb+mc>ma && ma>0 && mb>0 && mc>0)
            return true;
        return false;
    }
    
//    boolean laTamGiac(int a, int b, int c){
//        this.ma=a;
//        this.mb=b;
//        this.mc=c;
//        if(ma+mb>mc && ma+mc>mb && mb+mc>ma && ma>0 && mb>0 && mc>0)
//            return true;
//        return false;
//    }
    
    public int getChuVi(){
        return this.getCanhA()+this.getCanhB()+this.getCanhC();
    }
    
    public double getDienTich(){
        double p=0, S=0;
        p=(double) this.getChuVi()/2;
        S=Math.sqrt(p*(p-this.getCanhA())*(p-this.getCanhB())*(p-this.getCanhC()));
        return S;
    }
    
    public int getCanhA() {
        return ma;
    }

    public void setCanhA(int ma) {
        if(ma>0)
            this.ma = ma;
        else this.ma=0;
    }

    public int getCanhB() {
        return mb;
    }

    public void setCanhB(int mb) {
        if(mb>0)
            this.mb = mb;
        else this.mb=0;
    }

    public int getCanhC() {
        return mc;
    }

    public void setCanhC(int mc) {
        if(mc>0)
            this.mc = mc;
        else this.mc=0;
    }

//    @Override
//    public String toString() {
//        if(laTamGiac()){
//            return "chuaanr";
//        }
//        return "ko chuan";
//    }
}