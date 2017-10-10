/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack_week1;

import java.io.*;

/**
 *
 * @author LilyEvans
 */
public class Hack_week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        System.out.println("1. Say hello");
        System.out.println("2. Tổng 10 số chẵn đầu tiên");
        System.out.println("3. Giải phương trình bậc nhất");
        System.out.println("4. Giải phương trình bậc 2");
        System.out.println("5. Tổng n số nguyên dương đầu tiên");
        System.out.println("6. Tổng 1/n số nguyên dương đầu tiên");
        System.out.println("7. Tính n giai thừa");
        System.out.println("8. Tính tổng n giai thừa số nguyên dương đầu tiên");
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        String input;
        do {
            System.out.print("Chose what you want. Enter a number: ");
            input = inStream.readLine();
            int inp = Integer.parseInt(input);
            switch (inp) {
                case 1:
                    sayHello();
                    break;
                case 2:
                    System.out.println("Tổng 10 số chẵn đầu tiên là: ");
                    tongSoChan();
                    break;
                case 3:
                    System.out.println("Giải phương trình bậc nhất: ");
                    System.out.println(ptBacNhat());
                    break;
                case 4:
                    System.out.println("Phương trình bậc hai: ax^2 + bx + c = 0");
                    System.out.print("Enter a: ");
                    input = inStream.readLine();
                    float a = Float.parseFloat(input);
                    System.out.print("Enter b: ");
                    input = inStream.readLine();
                    float b = Float.parseFloat(input);
                    input = inStream.readLine();
                    float c = Float.parseFloat(input);
                    float[] result4 = ptBacHai(a, b, c);
                    System.out.println(result4[0] + " " + result4[1]);
                    break;
                case 5:
                    System.out.println("Tổng n số nguyên dương đầu tiên");
                    System.out.print("Nhập số: ");
                    input = inStream.readLine();
                    long input5 = Long.parseLong(input);
                    System.out.println(tongSoNguyenDuong(input5));
                    break;
                case 6:
                    System.out.println("Tổng các phân số có mẫu từ 1 đến n");
                    System.out.print("Nhập số: ");
                    input = inStream.readLine();
                    int n = Integer.parseInt(input);
                    System.out.println(n);
                    float result6 = tongPhanSo(n);
                    System.out.println(result6);
                    break;
                case 7:
                    System.out.print("Nhập số: ");
                    input = inStream.readLine();
                    int m = Integer.parseInt(input);
                    long result7 = giaiThua(m);
                    System.out.println(result7);
                    break;
                case 8:
                    System.out.println("Tổng giai thừa n số đầu tiên");
                    System.out.print("Nhập số: ");
                    input = inStream.readLine();
                    int TongGiaiThua = Integer.parseInt(input);
                    float result8 = tongGiaiThua(TongGiaiThua);
                    System.out.println(result8);
                    break;
            }
        } while (check());
    }

    public static boolean check() throws IOException {
        System.out.print("Do you want to continue (Enter 'N' to stop): ");
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        String input = input = inStream.readLine();
        if (input.equalsIgnoreCase("N")) {
            return false;
        } else {
            return true;
        }
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void tongSoChan() {
        int s = 0;
        for (int i = 2; i <= 20; i+=2) {
            s += i;
        }
        System.out.println(s);
    }

    public static float ptBacNhat() throws IOException {
        System.out.println("Phương trình bậc nhất: ax + b = 0");
        System.out.print("Enter a: ");
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        String input = inStream.readLine();
        float a = Float.parseFloat(input);
        System.out.print("Enter b: ");
        input = inStream.readLine();
        float b = Float.parseFloat(input);
        return -b / a;
    }

    public static float[] ptBacHai(float a, float b, float c) {
        float[] solution = new float[2];
        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm: ");
        } else if (0 == delta) {
            System.out.println("Phương trình có nghiệm kép: ");
            solution[0] = -b / (2 * a);
            solution[1] = -b / (2 * a);
        } else {
            System.out.println("Phương trình có hai nghiệm phân biệt: ");
            solution[0] = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            solution[1] = (float) ((-b - Math.sqrt(delta)) / (2 * a));
        }
        return solution;
    }

    public static long tongSoNguyenDuong(long a) {
        return (a * (a + 1) / 2);
    }

    public static float tongPhanSo(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (float) ((1.0 / n) + tongPhanSo(n - 1));
        }
    }

    public static long giaiThua(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return (n * giaiThua(n - 1));
        }
    }

    public static float tongGiaiThua(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return tongGiaiThua(n - 1) + n*(1f/ giaiThua(n));
        }
    }
}
