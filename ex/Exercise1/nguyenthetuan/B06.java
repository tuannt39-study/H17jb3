package vn.hackademics.excersices;
//Viết chương trình tính tổng S = 1 + 1/2 + 1/3 + … + 1/n với n nguyên dương được nhập từ bàn phím.
import java.util.Scanner;

public class B06 {
    public static void main(String[] args) {
        float n, tong=0;
        Scanner sc = new Scanner(System.in);
        for (int a=1; a<=10; a++){
            n = sc.nextFloat();
            if (n>0) {
                for (float i=1; i<=n; i++){
                    tong += (1/i);
                }
                System.out.println("Tổng = " + tong); break;
            } else {
                System.out.println("Giá trị n đã nhập không thích hợp! \nYêu câu nhập n lại lần " + a + " : ");
            }
        }
    }
}
