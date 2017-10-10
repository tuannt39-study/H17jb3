/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part6OOP;

import Exercise4.NhanVien;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LilyEvans
 */
public class NV {

    private int MaNV;
    private String Hoten;
    private String DiaChi;
    private boolean CBQL;

    public NV(int MaNV, String Hoten, String DiaChi, boolean CBQL) {
        this.MaNV = MaNV;
        this.Hoten = Hoten;
        this.DiaChi = DiaChi;
        this.CBQL = CBQL;
    }

    public int getMaNV() {
        return MaNV;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public boolean isCBQL() {
        return CBQL;
    }

    public String toString() {
        return "Mã NV: " + this.getMaNV() + " tên: "+ this.getHoten() + " đ/c: " + this.getDiaChi();
    }
}

class testEx6 {

    public static void main(String[] args) {
        ArrayList<NV> nhanVien = new ArrayList<>();
//        NV nv1 = new NV(123, "Lily1", "D4", true);
//        NV nv2 = new NV(124, "Lily2", "D5", false);
//        NV nv3 = new NV(123, "Lily1", "D4", true);
//        nhanVien.add(nv1);
//        nhanVien.add(nv2);
//        nhanVien.add(nv3);
        int ma = 0;
        String tenNv;
        String dc;
        int cbql = 0;
        String next = "ok";
        while(next.equals("ok")){
            Scanner nv = new Scanner(System.in);
            System.out.println("Nhap ma: ");
            ma = nv.nextInt();
            //ma = nv.nextInt();
            nv.nextLine();
            System.out.println("Nhap ten: ");
            tenNv = nv.nextLine();
            System.out.println("Dia chi: ");
            dc = nv.nextLine();
            System.out.println("Cbql (1): ");
            cbql = nv.nextInt();
            nv.nextLine();
            System.out.println("Nhap ok tiep tuc. Nguoc lại dừng");
            next = nv.nextLine();
            NV na = new NV(ma, tenNv, dc, (cbql==1?true:false));
            nhanVien.add(na);
            //nhanVien.add(new NV(ma, tenNv, dc, (cbql==1?true:false)));
        
        }
        for (int i = 0; i < nhanVien.size(); i++) {
            if (nhanVien.get(i).isCBQL()) System.out.println(nhanVien.get(i).toString());
        }
        for (NV n: nhanVien){
            if(n.isCBQL()) System.out.println(n.toString());
        }

    }
}
