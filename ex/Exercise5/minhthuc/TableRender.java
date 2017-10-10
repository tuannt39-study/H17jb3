package Excersice_5;

import PPL.PC;

import java.util.ArrayList;

/**
 * Created by minht on 4/27/2017.
 */
public class TableRender {
    private String model;
    private String Year;
    private String Manufacture;
    private String[] component;
    private int col1, col2,col3,col4;
    private int col5;
    public TableRender(int col1, int col2, int col3, int col4, int col5) {
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
        this.col5 = col5;
    }
    private String LeftPosition(int size, String  content){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(content);
        for (int i=0;i<(size-content.length());i++){
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
    public String RenderHeader(String Title){
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
    }
    public String Tbody(ArrayList<NhanVien> nv){
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        for (NhanVien p:nv) {
            stringBuilder.append(LeftPosition(col1,i+""));
            stringBuilder.append(LeftPosition(col2,p.getMaNV()));
            stringBuilder.append(LeftPosition(col3,p.getSoSP()+""));
            stringBuilder.append(LeftPosition(col4,p.getLuong()+""));
            stringBuilder.append(LeftPosition(col5,p.getTongKet()));
            stringBuilder.append("\n");
            i++;
        }
        return stringBuilder.toString();
    }
}
