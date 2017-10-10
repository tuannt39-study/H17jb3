package Excersice_5.ex9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by minht on 4/27/2017.
 */
public class DanhSachNhanVien extends ArrayList<NhanVien> {
    public DanhSachNhanVien() {
    }
    public int NumberOfNv(){
        return this.size();
    }
    public void addNhanVien(NhanVien n){
        this.add(n);
    }
    public String ThongtinNhanVien(){
        StringBuilder stringBuilder = new StringBuilder();
        for (NhanVien o:this){
            stringBuilder.append(o.getTenNV()+"\n");
        }
        return stringBuilder.toString();
    }
    private int[] min(int[] sample){
        int[] tmp = sample;
        Arrays.sort(tmp);
        int min = tmp[0];
        ArrayList<Integer> listmin = new ArrayList<>();
        int i=0;
        for (int a:sample){
            if (a==sample[i]){
                listmin.add(i);
            }
            i++;
        }
        int[] listminInt = new int[listmin.size()];
        for (int j=0;j<listmin.size();j++){
            listminInt[j] = listmin.get(j);
        }
        return listminInt;
    }
    private int[] max(long[] sample){
        long[] tmp = sample;
        Arrays.sort(tmp);
        long max = tmp[sample.length-1];
        ArrayList<Integer> listmax = new ArrayList<>();
        int i=0;
        for (long a:sample){
            if (a==sample[i]){
                listmax.add(i);
            }
            i++;
        }
        int[] listmaxInt = new int[listmax.size()];
        for (int j=0;j<listmax.size();j++){
            listmaxInt[j] = listmax.get(j);
        }
        return listmaxInt;
    }
    private String NvSpItNhat(){
        StringBuilder stringBuilder = new StringBuilder();
        int[] sp = new int[this.NumberOfNv()];
        int i=0;
        for (NhanVien o:this){
            sp[i] =o.getSoSP();
            i++;
        }
        int[] listmin = min(sp);
        for (int index : listmin){
            stringBuilder.append(this.get(index).getTenNV()+"\n");
        }
        return stringBuilder.toString();
    }
    private String NvLuongLonNhat(){
        StringBuilder stringBuilder = new StringBuilder();
        long[] sp = new long[this.NumberOfNv()];
        int i=0;
        for (NhanVien o:this){
            sp[i] =o.getLuong();
            i++;
        }
        int[] listmax = max(sp);
        for (int index : listmax){
            stringBuilder.append(this.get(index).getTenNV()+"\n");
        }
        return stringBuilder.toString();
    }
    private long TongLuongNhanVien(){
        long luong =0;
        for (NhanVien o:this){
            luong+=o.getLuong();
        }
        return luong;
    }
    private String TimKiemNhanVien(int manv){
        HashMap<String,String> dictionary = new HashMap<String, String>();
        for (NhanVien o:this){
            dictionary.put(o.getMaSV(),o.getTenNV());
        }
        return dictionary.get(manv);
    }
    private ArrayList<NhanVien> SortSoSanPham(ArrayList<NhanVien> a){
        Collections.sort(a,new NhanVien());
        return a;
    }
    private ArrayList<NhanVien> RemoveOnPosition(int position){
        this.remove(position);
        return this;
    }
}
