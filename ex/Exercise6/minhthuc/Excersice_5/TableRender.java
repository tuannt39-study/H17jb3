package Excersice_5;

import PPL.PC;

import java.util.ArrayList;

/**
 * Created by minht on 4/27/2017.
 */
public class TableRender {

    private int[] col;
    private int totalSize;
    public TableRender(int... width) {
        this.col = width;
        int size = 0;
        for (int a:width) {
            size+=a;
        }
        totalSize = size;
    }
    private String LeftPosition(int size, String content){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(content);
        for (int i=0;i<(size-content.length());i++){
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
    /*public String RenderHeader(String Title){
        int lengTitle = Title.length();
        StringBuilder stringBuilder = new StringBuilder();
        int size = col1+col2+col3+col4+col5;
        for (int i=0;i<(size);i++){
            stringBuilder.append("-");
        }
        stringBuilder.append("\n");
        for (int i=0;i<(size-lengTitle)/2;i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append(Title+"\n");
        for (int i=0;i<(size);i++){
            stringBuilder.append("-");
        }
        stringBuilder.append("\n");
//        return stringBuilder.toString();

        stringBuilder.append("STT");
        for (int i=0;i<col1-"STT".length();i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("Ma nhan vien");
        for (int i=0;i<col2-"Ma nhan vien".length();i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("So San Pham");
        for (int i=0;i<col3-"So San Pham".length();i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("Luong");
        for (int i=0;i<col4-"Luong".length();i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("Tong Ket");
        for (int i=0;i<col5-"Tong Ket".length();i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }*/
    public String RenderHeaderDynamic(String title,String... colname){
        if (colname.length == this.col.length){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0;i<this.totalSize;i++){
                stringBuilder.append("-");
            }
            stringBuilder.append("\n");
            for (int i=0;i<(totalSize-title.length()/2);i++){
                stringBuilder.append(" ");
            }
            stringBuilder.append(title+"\n");
            for (int i = 0;i<this.totalSize;i++){
                stringBuilder.append("-");
            }
            stringBuilder.append("\n");
            int j=0;
            for (String col:colname) {
                stringBuilder.append(col);
                for (int i =0;i<this.col[j]-col.length();i++){
                    stringBuilder.append(" ");
                }
                j++;
            }
            stringBuilder.append("\n");
            return stringBuilder.toString();
        }else return "Can not out of column";

    }
    public String Tbody(ArrayList<NhanVien> nv){
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (NhanVien p:nv) {
            stringBuilder.append(LeftPosition(col[i],(i+1)+""));
            stringBuilder.append(LeftPosition(col[i],p.getMaNV()));
            stringBuilder.append(LeftPosition(col[i],p.getSoSP()+""));
            stringBuilder.append(LeftPosition(col[i],p.getLuong()+""));
            stringBuilder.append(LeftPosition(col[i],p.getTongKet()));
            stringBuilder.append("\n");
            i++;
        }
        return stringBuilder.toString();
    }
}
