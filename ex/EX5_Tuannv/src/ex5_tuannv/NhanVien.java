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
public class NhanVien {
    private String maNV;
    private int soSP;
    static int sp = 20000;
    static int spVuot= 30000;
    NhanVien(){
        
    }
    
    NhanVien(String ma, int sp){
        
    }
    
    public boolean coVuotChuan(){
        if(this.soSP>500)
            return true;
        return false;
    }
    
    public String getTongKet(){
        if(coVuotChuan()){
            return "Vuot";
        }
        return "";
    }
    
    public long getLuong(){
        long L=0;
        if(this.soSP<=500){
            L=this.soSP*sp;
        }else{
            L= (this.soSP-500)*spVuot + 500*sp;
        }
        return L;
    }
    
    public static void XuatTieuDe(){
        System.out.println("Ma nhan vien\t So san pham\t Luong\t Tong ket");
    }

    @Override
    public String toString() {
        return  this.maNV+ "\t\t  " +this.soSP+ "\t\t  " +this.getLuong()+ "  " +this.getTongKet();
    }
    
    public void Input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ma NV: ");
        this.setMaNV(sc.nextLine());
        System.out.println("Nhap so SP: ");
        this.setSoSP(sc.nextInt());
    }
    
    public void Output(){
        System.out.println(this.toString());
    }
    
    public void setMaNV(String maNV){
        this.maNV = maNV;
    }
    
    public String getMaNV(){
        return this.maNV;
    }
    
    public void setSoSP(int soSP){
        if(soSP>0){
            this.soSP = soSP;
        }else{
            this.soSP=0;
        }
    }
    
    public int getSoSP(){
        return this.soSP;
    }
}