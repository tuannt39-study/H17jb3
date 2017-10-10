package Excersice_5;

import java.util.ArrayList;

/**
 * Created by minht on 5/4/2017.
 */
public class NhanVien {
    private String maNV;
    private int soSP;

    public NhanVien() {
    }

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }
    public boolean coVuotChuan(){
        if (soSP>500){
            return true;
        }else return false;
    }
    public String getTongKet(){
        if (coVuotChuan()){
            return "Vuot";
        }else return "";
    }
    public int getLuong(){
        if (coVuotChuan()){
            return 500*20000+(soSP-500)*30000;
        }else return soSP*20000;
    }
//    public String XuatTieude(){
//        TableRender tableRender = new TableRender(5,30,30,30,30);
////        String title = tableRender.RenderHeader("Danh sach nhan vien");
////        return title;
//    }
    public String toString(){
        return "Ma nhan vien: "+this.getMaNV()+ "So San Pham: "+this.getLuong()+"Tong Ket "+ this.getTongKet();
    }
}
class test{
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("M123456",504);
//        System.out.println(nhanVien.XuatTieude());
        TableRender tableRender = new TableRender(5,30,30,30,30);
        ArrayList<NhanVien> nhanVienArrayList = new ArrayList<>();
        nhanVienArrayList.add(nhanVien);
        nhanVienArrayList.add(nhanVien);
        System.out.println(tableRender.Tbody(nhanVienArrayList));
    }
    private static void generic(int... a){
        for (int b:a) {
            System.out.println(b);
        }
    }
}
