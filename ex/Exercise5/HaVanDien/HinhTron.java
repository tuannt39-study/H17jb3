/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author Admin
 */
public class HinhTron {
   private int r;
   private float s;
   private float c;
 public HinhTron(){
     
 }
 public void setr(int r){
     this.r=r;
 }
 public int getr(){
     return r;
 }
 public void setS(float s){
     this.s=s;
 }
 public float getS(){
     return s;
 }
 public void setC(float c){
     this.c=c;
 }
 public float getc(){
     return c;
 }
 public void dientich(){
     s=(float) (r*r*3.14);
     System.out.println("Dien tich Hinh tron:" +s);
     
 }
 public void chuvi(){
     c=(float) (2*r*3.14);
     System.out.println("Chu vi hinh tron"+c);
 }

    
}
