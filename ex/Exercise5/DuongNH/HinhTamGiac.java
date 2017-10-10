/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B5.Triangle;

/**
 *
 * @author Win7
 */
import java.lang.Math;
import java.util.Scanner;

public class HinhTamGiac {
    private int ma;
    private int mb;
    private int mc;
    
    public HinhTamGiac(){}
    
    public HinhTamGiac(int a, int b, int c){
        /*this.ma = (a<0)?0:a;
        this.mb = (b<0)?0:b;
        this.mc = (c<0)?0:c;*/
        if(a<0 || b<0 || c<0){
            System.out.println("Canh tam giac khong duoc am!");
            if(a<0)a=0; 
            if(b<0)a=0; 
            if(b<0)a=0; 
        }
        if(a+b<=c||c+b<=a||c+a<=b){
            System.out.println("Ba canh tren khong phai 3 canh tam giac");
            a=b=c=0;
        }
        ma = a;
        mb = b;
        mc = c;
    }
    
    public int getCanhA(){
        return ma;
    }
    
    public int getCanhB(){
        return mb;
    }
    
    public int getCanhC(){
        return mc;
    }
    
    public void setCanhA(int v){
        ma = v;
    }
    
    public void setCanhB(int v){
        mb = v;
    }
    
    public void setCanhC(int v){
        mc = v;
    }
    
    public boolean laTamGiac(){
        return(ma+mb>mc && mb+mc>ma && mc+ma>mb);
    }
    public boolean laTamGiac(int a, int b, int c){
        return(a+b>c && c+b>a && c+a>b);
    }
    
    public int getChuVi(){
        return (ma + mb + mc);
    }
    
    public double getDienTich(){
        double p = (double)(ma+mb+mc)/2;
        return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
    }
    
    // ham main
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri ba canh cua tam giac: ");
        int ma = sc.nextInt();sc.nextLine();
        int mb = sc.nextInt();sc.nextLine();
        int mc = sc.nextInt();sc.nextLine();
        
        HinhTamGiac tamgiac = new HinhTamGiac(ma, mb, mc);
        if(tamgiac.laTamGiac()){
            System.out.println("Chu vi tam giac = " + tamgiac.getChuVi());
            System.out.println("Dien tich tam giac = " + tamgiac.getDienTich());
        }
    }
}
