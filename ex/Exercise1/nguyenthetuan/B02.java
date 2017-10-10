package vn.hackademics.excersices;
//Viết chương trình in ra tổng của 10 số chẵn đầu tiên
public class B02 {
    public static void main(String[] args) {
        int tong=0;
        for (int n=0; n<10; n++){
            tong += n*2;
        }
        System.out.println("Tổng của 10 số chẵn đầu tiên: \ntong = " + tong);
    }
}
