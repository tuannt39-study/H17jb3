/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSachNhanVien extends ArrayList<NhanVien> {

    ArrayList<NhanVien> dsnv = new ArrayList<>();

    /**
     * @return the dsnv
     */
    public ArrayList<NhanVien> getDsnv() {
        return dsnv;
    }

    /**
     * @param dsnv the dsnv to set
     */
    public void setDsnv(ArrayList<NhanVien> dsnv) {
        this.dsnv = dsnv;
    }
//
//    public void addNhanVien(NhanVien nv) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao ma Nhav Vien: ");
//        String Ma = sc.nextLine();
//        System.out.println("Nhap vao so san pham: ");
//        int ssp = sc.nextInt();
//
//    }

    public int sizeDsnv() {
        System.out.println("So Nhan vien:" + dsnv.size());
        return dsnv.size();
    }

    public void spVuot() {
        for (NhanVien o:this.dsnv) {
            if (o.getSoSP()>500) {
                System.out.println("nhan vien vuot Chi tieu:" + o.toString());
            } else {
            }
        }
    }

    public float tongLuongVuot() {
        float tongluong = 0;
        for (NhanVien o:this.dsnv) {
            if (o.getSoSP()>500) {
                tongluong += o.getLuong();
            }
        }
        System.out.println("Tong so luong vuot chuan" + tongluong);
        return tongluong;
    }

    public int demNhanVien() {
        int dem = 0;
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).getSoSP()<500) {
                dem++;
            }
        }
        System.out.println("So Nhan Vien khong vuot chuan:" + dem);
        return dem;
    }

    public int minSanPham() {
        int min = dsnv.get(0).getSoSP();
        for (NhanVien o:this.dsnv) {
            if (min > o.getSoSP()) {
                min = o.getSoSP();
            }
        }
        System.out.println("Nhan vien co so san pham it nhat la: " + min);
        return min;
    }

    public long luongMax() {
        long max = dsnv.get(0).getLuong();
        int a = 0;
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).getLuong() > max) {
                max = dsnv.get(i).getLuong();
                a = i;
            }
        }
        System.out.println("Nhan vien co luong cao nhat la: " + dsnv.get(a).toString());
        return max;
    }

    public long luongmax2() {
        long[][] min= new long[100][100];
        long max = min[0][0];
        int a = 0;
        int c=0;
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).getSoSP() < 500) {
                min[a][1]=dsnv.get(i).getLuong();
                min[a][2]=i; 
                a++;
                
            }
        }
        for (int i = 0; i < min.length; i++) {
            if (max < min[i][1]) {
                max = min[i][1];
                c=(int) min[i][2];
            }
        }
        System.out.println("Nhan vien khong vuot chuan co luong lon nhat la: " + dsnv.get(c).toString());
        return max;
    }
    public long tongLuongNv(){
        long tongLuong = 0;
        for(NhanVien o:this.dsnv){
            tongLuong+=o.getLuong();
        }
        System.out.println("Tong luong tat ca nhan vien: "+tongLuong);
        return tongLuong;
        
    }

    private ArrayList<NhanVien> SortSoSanPham(ArrayList<NhanVien> a){
        Collections.sort(a,new NhanVien());
        return a;
    }
    private ArrayList<NhanVien> RemoveOnPosition(){
        int position;
        System.out.println("Nhap vao vi tri can xoa");
        Scanner sc= new Scanner(System.in);
        position= sc.nextInt();
        this.remove(position);
        return this;
    }

    public void search() {
        int kt=0;
        System.out.println("Nhap vao ma nhan vien ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).getMaNv().equals(a)) {
                System.out.println(dsnv.get(i).toString());
            }
            else{
                kt=1;
            }
        }
        if(kt==1){
            System.out.println("Khong co nhan vien trong danh sach");
            
        }
    }
    
    

    public static void main(String[] args) {
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        DanhSachNhanVien ds =new DanhSachNhanVien();
        String ma;
        int ssp = 0;
        String next = "ok";
        while (next.equals("ok")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ma: ");
            ma = sc.nextLine();
            System.out.println("Nhap So San Pham: ");
            ssp = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap ok tiep tuc. Nguoc lai dung");
            next = sc.nextLine();
            NhanVien nv = new NhanVien(ma, ssp);
            nv.tinhLuong();
            dsnv.add(nv);
            ds.dsnv.add(nv);
        }
        System.out.println(dsnv.toString());
        ds.sizeDsnv();
        ds.spVuot();
        ds.tongLuongNv();
        ds.tongLuongVuot();
        ds.demNhanVien();
        ds.luongMax();
        ds.luongmax2();
        ds.minSanPham();
        ds.search();
        ds.SortSoSanPham(dsnv);
        System.out.println(dsnv.toString());
        ds.RemoveOnPosition();
       
    }  
}
