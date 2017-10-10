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
public class sinhVien {

    /**
     * @param args the command line arguments
     */
    private String maSV,hoTen;
    private float diemLt,diemTh,diemTB;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLt() {
        return diemLt;
    }

    public void setDiemLt(float diemLt) {
        this.diemLt = diemLt;
    }

    public float getDiemTh() {
        return diemTh;
    }

    public void setDiemTh(float diemTh) {
        this.diemTh = diemTh;
    }

    public float getDiemTB(){
    return diemTB= (diemLt+ diemTh)/2;
    }
    public sinhVien(){};
    public sinhVien(String maSV, String hoTen, float diemLt,float diemTh){
    this.maSV= maSV;
    this.hoTen=hoTen;
    this.diemLt= diemLt;
    this.diemTh=diemTh;
    this.diemTB= (this.diemLt+ this.diemTh)/2;
    }
    
    public String getTongket(sinhVien s){
        if(s.getDiemTB()>=5){return "Đậu!";}
        else return "Rớt!";
    }
    
    public void Nhap(){
    Scanner input= new Scanner(System.in);
        System.out.println("Nhập vào thông tin SV:");
        System.out.print("Nhập vào ma SV:");
        this.maSV= input.nextLine();
        System.out.print("Nhập vào ho ten:");
        this.hoTen= input.nextLine();
        System.out.print("Nhập vào điểm lý thuyết:");
        this.diemLt=input.nextInt();
        System.out.print("Nhập vào điểm thực hành:");
        this.diemTh=input.nextInt();
        
    }
    public String toString(){
    return "MaSV:"+this.maSV+"\t|Ho và ten:"+ this.hoTen+"\t|Diem ly thuyet:"+this.diemLt+"\t|Diem thưc hanh:"+this.diemTh+"\t|Diem TB:"+this.getDiemTB();
    }
}
