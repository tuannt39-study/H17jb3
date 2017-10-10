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
public class Ex13 {

    public static Ex13 Create() {
        return new Ex13();
    }

    Ex13() {
        Scanner input = new Scanner(System.in);
        InputMatric(input);

        System.out.println("Lựa chọn xử lý tương ứng với danh sách bên dưới:\n"
                + "1. In ma trận. \n"
                + "2. TÌm phần tử nhỏ nhất. \n"
                + "3. TÌm phần tử lẻ lớn nhất.\n"
                + "4. Tìm dòng có tổng lớn nhất. \n"
                + "5. Exit.\n"
                + "--------------------------------------------");

        switch (input.nextInt()) {
            case 1:
                PrintMatric();
                break;
            case 2:
                SearchMin();
                break;
            case 3:
                SearchMaxLe();
                break;
            case 4:
                MaxTotalRow();
                break;
            case 5:
                break;
            default:
                Create();
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
                matrixA[i][j] = input.nextInt();
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

    void SearchMin() {
        int row = 0;
        int col = 0;
        int intMin = matrixA[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrixA[i][j] < intMin) {
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Phần tử (" + (row + 1) + "," + (col + 1) + ") có giá trị nhỏ nhất là: " + matrixA[row][col]);
    }

    void SearchMaxLe() {
        int row = 0;
        int col = 0;
        int intMaxChan = matrixA[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (0 != matrixA[i][j] % 2 && matrixA[i][j] > intMaxChan) {
                    row = i;
                    col = j;
                }
            }
        }
        if (0 != intMaxChan % 2) {
            System.out.println("Phần tử (" + (row + 1) + "," + (col + 1) + ") có giá trị lẻ lớn nhất là: " + matrixA[row][col]);
        } else {
            System.out.println("Không tồn tại phần tử có giá trị lẻ trong matrix A");
        }
    }

    void MaxTotalRow() {
        int row = 0;
        int intMax = 0;

        for (int i = 0; i < n; i++) {
            int totalR = 0;
            for (int j = 0; j < m; j++) {
                totalR += matrixA[i][j];
            }
            if (totalR > intMax) {
                row = i;
                intMax = totalR;
            }
        }

        System.out.println("Dòng " + (row + 1) + " có tổng lớn nhất là: " + intMax);
    }
}
