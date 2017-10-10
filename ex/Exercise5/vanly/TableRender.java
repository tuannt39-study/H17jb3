package part6OOP;

import java.util.ArrayList;

/**
 * @overview this class is to create table and message
 */
public class TableRender {

    private String model;
    private String Year;
    private String Manufacture;
    private String[] component;
    private int col1, col2, col3, col4, col5, size;

    /**
     * Constructor of class TableRender size is a derived attribute
     *
     * @param col1
     * @param col2
     * @param col3
     * @param col4
     * @param col5
     */
    public TableRender(int col1, int col2, int col3, int col4, int col5) {
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
        this.col5 = col5;
        //derived attribute
        this.size = col1 + col2 + col3 + col4 + col5;
    }

    /**
     * @effect return each element of table with blank space fit size of column
     * if length of content > size, use "..."
     * @param size
     * @param content
     * @return
     */
    private String LeftPosition(int size, String content) {
        StringBuilder stringBuilder = new StringBuilder();
        if (content.isEmpty()) {
            for (int i = 0; i < (size); i++) {
                stringBuilder.append(" ");
            }
        } else if (content.length() < size) {
            stringBuilder.append(content);
            for (int i = 0; i < (size - content.length()); i++) {
                stringBuilder.append(" ");
            }
        } else {
            stringBuilder.append(content.substring(0, size - 5));
            stringBuilder.append("...  ");
        }
        return stringBuilder.toString();
    }

    /**
     *
     * @param Title
     * @return say hello
     */
    public String RenderMessage(String Title) {
        int lengTitle = Title.length();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < (this.size - lengTitle) / 2; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(Title + "\n");
        return stringBuilder.toString();
    }

    public String RenderDash() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < (this.size); i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    /**
     * @param Title
     * @return header and the first row performs type of content in each column
     */
    public String RenderHeader(String Title) {
        int lengTitle = Title.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < (this.size); i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n");
        for (int i = 0; i < (this.size - lengTitle) / 2; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(Title + "\n");
        for (int i = 0; i < (this.size); i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n");

        stringBuilder.append("No");
        for (int i = 0; i < col1 - "No".length(); i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("Mã nv");
        for (int i = 0; i < col5 - "Mã nv".length(); i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("Số sản phẩm");
        for (int i = 0; i < col2 - "Sổ sản phẩm".length(); i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("Lương");
        for (int i = 0; i < col3 - "Lương".length(); i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("Tổng kết");
        for (int i = 0; i < col4 - "Tổng kết".length(); i++) {
            stringBuilder.append(" ");
        }

        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    /**
     *
     * @param pc
     * @return table content by append each row as a element in arrayList
     */
    public String Tbody(ArrayList<NhanVien> nv) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        for (NhanVien p : nv) {
            stringBuilder.append(LeftPosition(col1, i + ""));
            stringBuilder.append(LeftPosition(col2, p.getMaNV()));
            stringBuilder.append(LeftPosition(col3, p.getSoSP() + ""));
            stringBuilder.append(LeftPosition(col4, p.getLuong() + ""));
            stringBuilder.append(LeftPosition(col5, p.getTongKet()));
            stringBuilder.append("\n");
            i++;
        }
        return stringBuilder.toString();
    }
}
