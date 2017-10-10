package vn.hackademics.ex2;
//Viết chương trình kiểm tra xem một số nguyên nhập vào có phải là số nguyên tố.
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class B11 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        if (n<2){
            System.out.println("n khong phai la so nguyen to");
        } else {
            int dem=0;
            for (int i = 1; i <= sqrt(n); i++) {
                if (n%i== 0) dem++;
            }
            if (dem>=2) {
                System.out.println("n khong phai la so nguyen to");
            } else System.out.println("n la so nguyen to");
        }
    }
}
