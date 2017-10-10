package vn.hackademics.excersices;
//Viết chương trình tính n! với n là số nguyên dương được nhập từ bàn phím

import java.util.Scanner;

public class B07 {
    public static void main(String[] args) {
        int n, gt=1;
        Scanner sc = new Scanner(System.in);
        for (int a=1; a<=10; a++) {
            n = sc.nextInt();
            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    gt *= i;
                }
                System.out.println("n! = " + gt); break;
            } else if (n == 0) {
                System.out.println("n! = 1"); break;
            } else {
                System.out.println("Giá trị n đã nhập không thích hợp! \nYêu câu nhập n lại lần " + a + " : ");
            }
        }
    }
}