package vn.hackademics.excersices;
//Viết chương trình giải phương trình bậc nhất
import java.util.Scanner;

public class B03 {
    public static void main(String[] args) {
        float a, b, f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của a: ");
        a = sc.nextFloat();
        System.out.println("Nhập giá trị của b: ");
        b = sc.nextFloat();
        System.out.println("Phương trình là:\n" + a + "x " + "+ " + b + " = 0");
        f=(b/a);
        System.out.println("Đáp án: \nx = " + (-f));
    }
}
