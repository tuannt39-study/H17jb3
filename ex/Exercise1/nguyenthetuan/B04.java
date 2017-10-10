package vn.hackademics.excersices;
//Viết chương trình giải phương trình bậc hai.
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class B04 {
    public static void main(String[] args) {
        float a, b, c, delta, x1, x2, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của a: ");
        for (int i=1; i<=10; i++){
            a = sc.nextFloat();
            if (a!=0){
                System.out.println("Nhập giá trị của b: ");
                b = sc.nextFloat();
                System.out.println("Nhập giá trị của c: ");
                c = sc.nextFloat();
                System.out.println("Phương trình bậc 2: \n" + a + "x2 + (" + b + ")x + " + c + " = 0");
                delta=(b*b - 4*a*c);
                System.out.println("Giá trị delta = " + delta);
                if (delta==0){
                    x = (-b)/(2*a);
                    System.out.println("Phương trình có 1 nghiệm duy nhất là: \nx = " + x); break;
                } else if (delta<0){
                    System.out.println("Phương trình vô nghiệm "); break;
                } else {
                    System.out.println("Phương trình có 2 nghiệm phân biệt "); break;
                }
            } else {
                System.out.println("Giá trị a đã nhập không thích hợp! \nYêu cầu nhập a lại lần " + i + " :");
            }
        }
    }
}
