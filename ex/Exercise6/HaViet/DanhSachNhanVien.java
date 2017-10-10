/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author viet
 */
public class DanhSachNhanVien {

    Scanner in = new Scanner(System.in);
    ArrayList<NhanVien> dsNV = new ArrayList<>();

    public void addNV(NhanVien temp) {
        dsNV.add(temp);
    }

    public int tongNV(){
        return dsNV.size();
    }
    
    public String nvVuotChuan(){
        return null;
        
        
    }
}
