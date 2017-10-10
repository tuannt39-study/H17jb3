/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class danhsachNV {

    public ArrayList<nhanVien> list = new ArrayList<nhanVien>();

    public void add(nhanVien nv) {
        System.out.println("Thêm 1 nhân viên vào danh sách List:");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào mã NV:");
        nv.setMaNV(input.nextLine().toString());
        System.out.print("Nhập vào số SP:");
        nv.setSoSP(input.nextInt());
        nv.getLuong();
        nv.getTongKet();
        list.add(nv);
    }
    
    public String toString(){
    return list.toString();
    }
    
    public int tongsoNV(){
    int tongNV= 0;
    for(nhanVien s:list)
    {
        tongNV+=1;
    }
    return tongNV;
    }
    
    public void TTNV(nhanVien nv){
        for(nhanVien s:list){
    if(nv.getTongKet()=="Vượt")
    {
         System.out.println(nv.toString());
    }
    }
    }
}
