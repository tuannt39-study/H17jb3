/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4Collection;

import java.util.ArrayList;

/**
 *
 * @author ThaoJ
 */
public class Bai2 extends ArrayList<NhanVien>{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<NhanVien> nv = new ArrayList<>();
        NhanVien e = null;
        nv.add(e);
        nv.add(0, e);
        
        System.out.println("ABC" + nv);
    }
    
}
