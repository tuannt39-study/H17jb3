/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.bai7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author haopv
 */
public class bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*String sOut = String.format("Khong có gì %s - %s", new Object[]{"chuỗi 1","chuỗi 2"});
        System.out.println("sOut = " + sOut);*/

        AOb aOb = new AOb();
        //aOb.setl2F1(10);
        aOb.setF1(10);
        aOb.a1.f3 = 3;
        //System.out.println("Inner = " + aOb.a1.f3);
        //aOb.a1.inManhinh();
        
        
        /*
        System.out.println("aOb F1 = " + aOb.getF1());
        
        AOb aOb2 = new AOb();
        aOb2.setF1(20);
        System.out.println("aOb2 F1 = " + aOb2.getF1());
        
        
        System.out.println("aOb1 F1 = " + aOb.getF1());
        */
        /*
        changeA(aOb);
        
        System.out.println("aOb l2 = " + aOb.getF1());
        */
        
        
        BOb bOb = new BOb();
        //bOb.setF1(10);
        //System.out.println("BOb: "+bOb.getF1());
        //bOb.a1.inManhinh();
        
        
        //bOb.aMethod();
        //System.out.println("BOb: "+bOb.getF1());
        /*
        COb cOb = new COb();
        cOb.setF1(5);
        System.out.println("COb: "+cOb.getF1());
        cOb.aMethod();
        
        
*/

        DOb dOb = new DOb();
        
        dOb.inmanhinh();
    }
    public static void changeA(AOb aOb) {
        aOb.setF1(50);
    }
     
}
class DOb{
    //int f4;
    void inmanhinh(){
        //
        AOb  a = new AOb();
        //a.a1.inManhinh();
        
        AOb.A1Ob a1 = new AOb(). new A1Ob();
        a1.inManhinh();
        
    }
}

