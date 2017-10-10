/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_tuannv;

import java.util.Scanner;

/**
 *
 * @author TUAN
 */
public class SinhVien {
    private String maSV;
    private String HoTen;
    private float diemLT;
    private float diemTH;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    
    SinhVien(){
        
    }
    
//    SinhVien(String ma, String Ten, float LT, float TH){
//        this.maSV = ma;
//        this.HoTen = Ten;
//        this.diemLT = LT;
//        this.diemTH = TH;
//    }
    
    public void Input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ma SV: ");
        this.setMaSV(sc.nextLine());
        System.out.println("nhap ho ten SV: ");
        this.setHoTen(sc.nextLine());
        System.out.println("nhap diem LT: ");
        this.setDiemLT(sc.nextFloat());
        System.out.println("nhap diem TH: ");
        this.setDiemTH(sc.nextFloat());
    }
    
    public float getDTB(){
        float dTB=0;
        dTB= (float) (this.getDiemLT() + this.getDiemTH())/2;
        return dTB;
    }
    
    public String KetQua(){
        if(this.getDTB()>=5){
            return "Dau";
        }else{
            return "Rot";
        }
    }

    @Override
    public String toString() {
        return "\nHo va Ten: " + this.getHoTen() + "\tMa SV: " + this.getMaSV()+ "\tDiem TB: " + this.getDTB() + "\tKet qua: " +this.KetQua();
    }
    
    public void Output(){
        System.out.println(toString());
    }
}
