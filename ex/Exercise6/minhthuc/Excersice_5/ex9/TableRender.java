package Excersice_5.ex9;

import Excersice_5.NhanVien;

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
    public String Tbody(ArrayList<Excersice_5.ex9.NhanVien> t, int size){
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (Excersice_5.ex9.NhanVien p:t) {
            for (int j=0;j<size;j++){
                stringBuilder.append(LeftPosition(col[j],i+""));
            }
            i++;
        }
        return stringBuilder.toString();
    }
}
