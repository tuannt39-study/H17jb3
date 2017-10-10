/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops2;

/**
 *
 * @author LENOVO
 */
public class NhanVien {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    private String maNV;
    private int soSP;
    public NhanVien(String maNV, int soSP){
        if(validateSoSP(soSP)){
            this.soSP = soSP;
        } else {
            System.out.println("Negative value. Change this value " +soSP + " equal to 0. ");
            this.soSP = 0;
        }
        this.maNV = maNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (validateSoSP(soSP)) {
            this.soSP = soSP;
        } else {
            System.out.println("Negative value. Change this value " + soSP + " equal to 0. ");
            this.soSP = 0;
        }

    }
    public boolean coVuotChuan(){
        return this.soSP > 500;
}
    public String getTongKet() {
        String temp = "";
        if (this.coVuotChuan()) {
            temp = "Vuot";
        }
        return temp;
    }
    
    public boolean validateSoSP(int soSP){
        if(soSP < 0){
            return false;
        }
        return true;
    }
    public double getLuong() {
        return this.coVuotChuan() ? (double) (500 * 20000 + (this.soSP - 500) * 30000) : (double) this.soSP * 20000;
}
  

    @Override
    public String toString() {
        return this.maNV +"\t|" + this.soSP +"\t|" + this.getLuong()+"\t|"+this.getTongKet()+"\t|";
     
    }
}

