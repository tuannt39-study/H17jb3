package vn.hackademics.excersices;
//Viết chương trình tính tổng S = 1 + 2 + 3 + … + n  với n nguyên dương được nhập từ bàn phím
import java.util.Scanner;

public class B05 {
    public static void main(String[] args) {
        int n, tong=0;
        Scanner sc = new Scanner(System.in);
        for (int a=1; a<=10; a++){
            n = sc.nextInt();
            if (n>0) {
                for (int i=1; i<=n; i++){
                    tong += i;
                }
                System.out.println("Tổng = " + tong); break;
            } else {
                System.out.println("Giá trị n đã nhập không thích hợp! \nYêu cầu nhập n lại lần " + a + " :");
            }
        }
    }
}
