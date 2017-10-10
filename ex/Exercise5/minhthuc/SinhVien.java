package Excersice_5;

/**
 * Created by minht on 5/4/2017.
 */
public class SinhVien {
    private String MaSinhvien;
    private String HovaTen;
    private float diemLyThuyet;
    private float diemThucHanh;

    public SinhVien(String maSinhvien, String hovaTen, float diemLyThuyet, float diemThucHanh) {
        MaSinhvien = maSinhvien;
        HovaTen = hovaTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }
    public boolean isRedo(){
        if ((this.diemLyThuyet+this.diemThucHanh)/2>=5){
            return false;
        }else return true;
    }
    public double diemTrungBinh(){
        return (this.diemLyThuyet+this.diemThucHanh)/2;
    }
}
