/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_tuannv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TUAN
 */
public class EX5_Tuannv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        HinhTron O= new HinhTron();
//        System.out.println("nhap r= ");
          //Scanner sc= new Scanner(System.in);
//        O.setR(sc.nextFloat());
//        float S= O.DienTich(O);
//        float C= O.ChuVi(O);
//        System.out.println("S= " +S);
//        System.out.println("C= " +C);
//        HinhTamGiac htg= new HinhTamGiac();
//        System.out.println("nhap a= ");
//        htg.setCanhA(sc.nextInt());
//        System.out.println("nhap b= ");
//        htg.setCanhB(sc.nextInt());
//        System.out.println("nhap c= ");
//        htg.setCanhC(sc.nextInt());
//        if(htg.laTamGiac()){
//            System.out.println("la tam giac");
//            int C= htg.getChuVi();
//            System.out.println("C= " +C);
//            double S= htg.getDienTich();
//            System.out.format("S= %.2f", S);
//            System.out.println("");
//        }else{
//            System.out.println("khong la tam giac");
//        }

//          NhanVien nv1,nv2;
//          nv1=new NhanVien();
//          nv2=new NhanVien();
//          nv1.Input();
//          nv2.Input();
//          NhanVien.XuatTieuDe();
//          nv1.Output();
//          nv2.Output();
//
//            CNhanVien nv1, nv2;
//            nv1 = new CNhanVien();
//            nv2 = new CNhanVien();
//            nv1.Input();
//            nv2.Input();
//            nv1.Output();
//            nv2.Output();
//            // cach 1
//            if(nv1.NhieuHon(nv2)){
//                System.out.println("Nhan vien " +nv1.getmTen()+ " co so SP nhieu hon nhan vien " +nv2.getmTen());
//            }else{
//                System.out.println("Nhan vien " +nv2.getmTen()+ " co so SP nhieu hon nhan vien " +nv1.getmTen());
//            }
//            // cach 2
//            if(nv1.getmSoSP()>nv2.getmSoSP()){
//                System.out.println("Nhan vien " +nv1.getmTen()+ " co so SP nhieu hon nhan vien " +nv2.getmTen());
//            }else{
//                System.out.println("Nhan vien " +nv2.getmTen()+ " co so SP nhieu hon nhan vien " +nv1.getmTen());
//            }
//
//              SinhVien sv;
//              sv = new SinhVien();
//              sv.Input();
//              sv.Output();
                
              NhanVien_B6 nv1;
              nv1 = new NhanVien_B6();
              ArrayList<NhanVien_B6> ArrNV  = new ArrayList<NhanVien_B6>();
              Scanner sc = new Scanner(System.in);
              String ok = "1";
              while(ok.equals("1")){
                    System.out.println("Nhap ma NV: ");
                    nv1.setMaNV(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Nhap Ho va Ten: ");
                    nv1.setHoTen(sc.nextLine());
                    System.out.println("Nhap dia chi: ");
                    nv1.setDC(sc.nextLine());
                    System.out.println("Nhan vien nay co phai CBQL? ");
                    nv1.setCBQL(sc.nextBoolean());
                    sc.nextLine();
                    System.out.println("Nhap 1 de tiep tuc,nhap 0 de thoat");
                    ok = sc.nextLine();
                    NhanVien_B6 nv2;
                    nv2 = new NhanVien_B6(nv1.getMaNV(),nv1.getHoTen(), nv1.getDC(), nv1.isCBQL());
                    ArrNV.add(nv2);
                    
              }
              for(NhanVien_B6 nv3 : ArrNV){
                  if(nv3.isCBQL()){
                      nv3.Output();
                  }
              }
              
    }
}