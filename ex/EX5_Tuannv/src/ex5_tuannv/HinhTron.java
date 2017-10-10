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
public class HinhTron {
    private float r;
    HinhTron(){
        
    }
    HinhTron(float r){
       this.r=r;
    }
    public float DienTich(HinhTron O){
        return (float) (Math.PI*O.getR()*O.getR());
    }
    
    public float ChuVi(HinhTron O){
        return (float) (Math.PI*2*O.getR());
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}