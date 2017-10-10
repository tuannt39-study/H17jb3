package Excersice_5;

import java.util.ArrayList;

/**
 * Created by minht on 5/4/2017.
 */
public class Ex6 {
    private int MaNV;
    private String Hoten;
    private String DiaChi;
    private boolean CBQL;

    public Ex6(int maNV, String hoten, String diaChi, boolean CBQL) {
        MaNV = maNV;
        Hoten = hoten;
        DiaChi = diaChi;
        this.CBQL = CBQL;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int maNV) {
        MaNV = maNV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public boolean isCBQL() {
        return CBQL;
    }

    public void setCBQL(boolean CBQL) {
        this.CBQL = CBQL;
    }

    public Ex6 GetCB(){
        if (this.CBQL){
            return this;
        }else return null;
    }
    public String toString(){
        return this.getMaNV() + this.getHoten()+this.getDiaChi();
    }
}
class test3{
    public static void main(String[] args) {
        ArrayList<Ex6> ex6s = new ArrayList<>();
        Ex6 a1 = new Ex6(123,"Truong Minh Thuc", "HaNoi",true);
        Ex6 a2 = new Ex6(124,"Truong Minh thu", "ny",false);
        ex6s.add(a1);
        ex6s.add(a2);
        for (Ex6 a: ex6s){
            if (a.GetCB()!=null){
                System.out.println(a.GetCB().toString());
            }

        }
    }

}
