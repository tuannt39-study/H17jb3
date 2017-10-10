package Excersice_5;

/**
 * Created by minht on 5/4/2017.
 */
public class CNhanVien {
    private String mHo,mTen;
    private int soSp;

    public CNhanVien(String mHo, String mTen, int soSp) {
        this.setmHo(mHo);
        this.setmTen(mTen);
        this.setSoSp(soSp);
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getSoSp() {
        return soSp;
    }

    public void setSoSp(int soSp) {
        if (soSp<0){
            this.soSp=0;
        }else
        this.soSp = soSp;
    }
    public double getLuong(){
        if (soSp<200){
            return soSp*0.5;
        }else if (soSp<400){
            return 199*0.5+(soSp-199)*0.55;
        }else if (soSp<600){
            return 199*0.5+199*0.55+(soSp-199*2)*0.6;
        }else return 199*0.5+199*0.55+199*0.6+(soSp-199*3)*0.65;
    }
    public boolean NhieuHon(CNhanVien cNhanVien){
        if (this.getSoSp()>cNhanVien.getSoSp()){
            return true;
        }else return false;
    }
}
class test2{
    public static void main(String[] args) {
        CNhanVien cNhanVien = new CNhanVien("Truong","Minh",562);
        CNhanVien cNhanVien2 = new CNhanVien("Truong","tin",605);
        System.out.println(cNhanVien.NhieuHon(cNhanVien2));
        if (cNhanVien.NhieuHon(cNhanVien2)){
            System.out.println("Nhan vien 1 nhieu hon nhan vien 2:"+(cNhanVien.getSoSp()-cNhanVien2.getSoSp()));

        }else System.out.println("Nhan vien 2 nhieu hon nhan vien 1:"+(cNhanVien2.getSoSp()-cNhanVien.getSoSp()));
    }
}
