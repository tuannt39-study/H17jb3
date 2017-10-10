package vn.hackademics.ex2;
//Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số  8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32
import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        int n, tong=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        int m = n;
        while (n>0){
            tong+=n%10;
            n/=10;
        }
        System.out.println("Tong cac chu so cua " + m + " = " + tong);
    }
}
