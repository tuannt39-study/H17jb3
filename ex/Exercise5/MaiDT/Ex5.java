/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* HinhTron ht = new HinhTron(5);
        System.out.println("Chu vi hinh tron:" + ht.getChuVi());
        System.out.println("Dien tich hinh tron:" + ht.getDienTich());
        ht.setRadius(7);
        System.out.println("Chu vi lần 2:" + ht.getChuVi());
        System.out.println("Dien tich lần 2:" + ht.getDienTich());
        HinhTron ht2= new HinhTron();
        System.out.println("Chu vi hình tròn ht2:"+ht2.getChuVi());
        System.out.println("Dien tich hinh tròn ht2:"+ht2.getDienTich());*/
       /*HinhTamGiac tg= new HinhTamGiac();
       tg.setMa(-1);
        System.out.println(tg.getMa());
        */
       
      /* nhanVien nv = new nhanVien();
       nv.addFromType();
    //   nv.getLuong();
     //  nv.getTongKet();
        System.out.println(nv.toString());*/
      
   /* cNhanVien nv1 = new cNhanVien("Đồng","Mai",111);
      cNhanVien nv2= new cNhanVien("Anh","Anh",100);
      
        System.out.println(nv1.NhieuHon(nv2));*/
  /* sinhVien s1= new sinhVien();
   s1.Nhap();
        System.out.println(s1.toString());
        System.out.println("Kết quả:"+s1.getTongket(s1));*/
  
  
    Nhanvien6 nv6= new Nhanvien6(1234,"Mai","ANH", true);
    
    Nhanvien6 nv7= new Nhanvien6(1235,"Mai2","ANH", true);
    
    Nhanvien6 nv8= new Nhanvien6(1238,"Mai3","ANH", false);
    ArrayList<Nhanvien6> list =new ArrayList<Nhanvien6>();
    list.add(nv8);
    list.add(nv6);list.add(nv7);
   
    for(int i=0;i<3;i++)
    {
        if(list.get(i).CBQL)
            System.out.println("Là cán bộ"+list.get(i).CBQL);
        
    }

    }

}
