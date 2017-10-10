package vn.hackademics.ex2;
//Dãy số Fibonacci được định nghĩa như sau: F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2. Hãy viết chương trình tìm số Fibonacci thứ n
import java.util.Scanner;

public class B09 {
    public static void main(String[] args) {
        int n, f0=1, f1=1, fn=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        n = sc.nextInt();
        if (n==0 || n==1){
            fn=1;
            System.out.println("F[" + n + "] = " + fn);
        } else if (n>1){
            for (int i=2; i<=n; ++i){
                fn=f0+f1;
                f0=f1;
                f1=fn;
            } System.out.println("F[" + n + "] = " + fn);
        } else System.out.println("Gia tri n khong hop le!");
    }
}
