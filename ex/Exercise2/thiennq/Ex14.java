/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_git;

import java.util.Scanner;

/**
 *
 * @author thiennq
 */
public class Ex14 {

    public static Ex14 Create() {
        return new Ex14();
    }

    Ex14() {
        Scanner input = new Scanner(System.in);
        InputMatric(input);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Lựa chọn xử lý tương ứng với danh sách bên dưới:\n"
                    + "1. Tìm phần tử lớn nhất của ma trận cùng chỉ số của số đó. \n"
                    + "2. TÌm và in ra các phần tử là số nguyên tố của ma trận( các phần tử không nguyên tố thay bằng số 0). \n"
                    + "3. Sắp xếp tất cả các cột của ma trận theo thứ tự tăng dần rồi in ra màn hình.\n"
                    + "4. Exit.\n"
                    + "--------------------------------------------");

            switch (input.nextInt()) {
                case 1:
                    SearchMax();
                    break;
                case 2:
                    SearchSNT();
                    break;
                case 3:
                    SortByCol();
                    PrintMatric();
                    break;
                case 4:
                    isExit = true;
                    break;
            }
        }
    }

    int n, m;
    int[][] matrixA;

    void InputMatric(Scanner input) {
        System.out.println("Nhập ma trận A cấp n x m");
        System.out.println("Nhập số dòng của ma trận");
        n = input.nextInt();
        System.out.println("Nhập số cột của ma trận");
        m = input.nextInt();
        matrixA = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập giá trị phần tử (" + (i + 1) + "," + (j + 1) + "):");
                int val = input.nextInt();
                if (0 < val && val < 100) {
                    matrixA[i][j] = val;
                } else {
                    System.out.println("Hãy nhập vào số nguyên tử 1 đến 99");
                }
            }
        }
    }

    void SearchMax() {
        int row = 0;
        int col = 0;
        int intMax = matrixA[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrixA[i][j] > intMax) {
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Phần tử (" + (row + 1) + "," + (col + 1) + ") có giá trị lớn nhất là: " + matrixA[row][col]);
    }

    void SearchSNT() {
        boolean haveSNT = false;
        boolean isSNT;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                isSNT = matrixA[i][j] > 1;

                for (int k = 2; k < matrixA[i][j]; k++) {
                    if (0 == matrixA[i][j] % k) {
                        isSNT = false;
                        break;
                    }
                }
                if (isSNT) {
                    haveSNT = true;
                    System.out.println("Phần tử (" + (i + 1) + "," + (j + 1) + ") có giá trị " + matrixA[i][j] + " là số nguyên tố");
                } else {
                    matrixA[i][j] = 0;
                }
            }
        }

        if (!haveSNT) {
            System.out.println("Không có số nguyên tố trong dãy bạn nhập.");
        }
    }

    void SortByCol() {
        System.out.println("Mảng sau khi sắp xếp sẽ là:\n");
        int temp;
        for (int col = 0; col < m; col++) {
            for (int row = 0; row < n; row++) {
                for (int i = row; i < n; i++) {
                    if (matrixA[row][col] > matrixA[i][col]) {
                        temp = matrixA[i][col];
                        matrixA[i][col] = matrixA[row][col];
                        matrixA[row][col] = temp;
                    }
                }
            }
        }
    }

    void PrintMatric() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Phần tử (" + (i + 1) + "," + (j + 1) + ") trong ma trận A là: " + matrixA[i][j]);
            }
        }
    }

}
