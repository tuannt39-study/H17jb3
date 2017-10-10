package vn.hackademics.excersices;
//Viết chương trình tính tổng S =  1 /1! +  2 /2! + ....+  n / n!
import java.util.Scanner;

public class B08 {
    public static void main(String[] args) {
        int n;
        float tong=0, gt=1;
        Scanner sc = new Scanner(System.in);
        for (int a=1; a<=10; a++) {
            n = sc.nextInt();
            if (n > 0) {
                for (float i=1; i<=n; i++) {
                    tong += i/(gt*=i);
                }
                System.out.println("Tổng = " + tong); break;
            } else {
                System.out.println("Giá trị n đã nhập không thích hợp! \nYêu câu nhập n lại lần " + a + " : ");
            }
        }
    }
}