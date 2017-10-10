/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

import java.io.DataOutputStream;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien7 {

    /**
     * @param args the command line arguments
     */
   public String maNV;
   public String hoTen;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
   public int tuoi;
   public long luong;
   public  NhanVien7(){  
   
   }
   
   public void addFromType( ){
     
       Scanner input=new Scanner(System.in);
       System.out.print("Nhập vào mã NV:");
       maNV=input.nextLine();
       System.out.print("Nhập vào họ tên NV:");
       hoTen=input.nextLine();
       System.out.print("Nhập vào tuổi:");
       tuoi=input.nextInt();
       System.out.print("Nhập vào lương:");
       luong=input.nextLong();
   }
   public void writeNV(DataOutputStream file) throws Exception{
       file.writeUTF(this.toString()+"\n");
   }
   @Override
   public String toString(){
        return "MaNV:"+this.maNV+"\t|Tên NV:"+this.hoTen+"\t|Tuổi:"+this.tuoi+"\t|Lương NV:"+this.luong+"\r\n";
   }
    
   
   
}


