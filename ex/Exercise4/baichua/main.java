/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;


/**
 *
 * @author haopv
 */
public class main {
    public static void main(String[] args) {
        NhanVien n1 = new NhanVien();
        NhanVien n2 = new NhanVien("Nhan vien A",8);
        NhanVien n3 = new NhanVien("Nhan vien A",8,"02");
        NhanVien n4 = new NhanVien("Nhan vien A","03",9);
        NhanVien n5 = new NhanVien("Nhan vien A","03",10,100l);
        
        DanhSachNhanVienBai2 ds = new DanhSachNhanVienBai2();
        ds.add(n1);
        ds.add(n2);
        ds.add(n3);
        ds.add(n4);
        ds.add(n5);
        
        System.out.println("min sp: "+ ds.spMin());
        System.out.println("Luong max: "+ ds.luongMax());
        
        //ds.addFromType();
        ds.show();
        
        /*
        n1.show();
        n2.show();
        n3.show();
        n4.show();
        n5.show();
*/
        
        
}
}
