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
public class Ex12 {

    public static Ex12 Create() {
        return new Ex12();
    }

    private Ex12() {
        Scanner input = new Scanner(System.in);

        InputArrInt(input);
        if (arrInt.length == 0) {
            return;
        }

        System.out.println("Lựa chọn xử lý tương ứng với danh sách bên dưới:\n"
                + "1. Xuất giá trị các phần tử của mảng. \n"
                + "2. TÌm phần tử có giá trị lớn nhất, nhỏ nhất. \n"
                + "3. Đếm số phần tử là số chẵn.\n"
                + "4. Tìm các phần tử là số nguyên tố. \n"
                + "5. Sắp xếp mảng tăng dần. \n"
                + "6. TÌm phần tử có giá trị x.\n"
                + "7. Exit.\n"
                + "--------------------------------------------");

        switch (input.nextInt()) {
            case 1:
                OutputArr();
                break;
            case 2:
                SearchMinMax();
                break;
            case 3:
                CountSoChan();
                break;
            case 4:
                SearchSNT();
                break;
            case 5:
                SortAscending();
                break;
            case 6:
                SeachX(input);
                break;
            case 7:
                break;
            default:
                Create();
                break;
        }
    }

    int[] arrInt;

    void InputArrInt(Scanner input) {
        System.out.println("Hãy nhập kích thước mảng: ");
        int len = input.nextInt();
        arrInt = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Hãy nhập phần tử thứ " + (i + 1) + " của mảng");
            arrInt[i] = input.nextInt();
        }
    }

    void OutputArr() {
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Phần tử thứ " + i + "là: " + arrInt[i]);
        }
    }

    void SearchMinMax() {
        int intMin = arrInt[0];
        int intMax = arrInt[0];
        for (int i : arrInt) {
            if (i < intMin) {
                intMin = i;
            } else if (i > intMax) {
                intMax = i;
            }
        }
        System.out.println("Giá trị lớn nhất là: " + intMax + "\n"
                + " Giá trị nhỏ nhất là: " + intMin);
    }

    void CountSoChan() {
        int count = 0;
        for (int i : arrInt) {
            if (0 == i % 2) {
                count++;
            }
        }

        System.out.println("Số lượng số chẵn trong dãy số là:" + count);
    }

    void SearchSNT() {
        boolean haveSNT = false;
        boolean isSNT;
        for (int i = 0; i < arrInt.length; i++) {
            isSNT = arrInt[i] > 1;
            for (int j = 2; j < arrInt[i]; j++) {
                if (0 == arrInt[i] % j) {
                    isSNT = false;
                    break;
                }
            }
            if (isSNT) {
                haveSNT = true;
                System.out.println("Phần tử thứ " + (i + 1) + " = " + arrInt[i] + " là số nguyên tố.");
            }
        }
        if (!haveSNT) {
            System.out.println("Không có số nguyên tố trong dãy bạn nhập.");
        }
    }

    void SortAscending() {
        System.out.println("Mảng sau khi sắp xếp sẽ là:\n");
        int temp;
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = i; j < arrInt.length; j++) {
                if (arrInt[i] > arrInt[j]) {
                    temp = arrInt[j];
                    arrInt[j] = arrInt[i];
                    arrInt[i] = temp;
                }
            }
            System.out.println(arrInt[i]);
        }
    }

    void SeachX(Scanner input) {
        System.out.println("Nhập giá trị cần tìm");
        int x = input.nextInt();
        boolean haveX = false;
        for (int i = 0; i < arrInt.length; i++) {
            if (x == arrInt[i]) {
                haveX = true;
                System.out.println("Phần tử thứ " + i + " có giá trị là " + x);
            }
        }

        if (!haveX) {
            System.out.println("Không có phần tử nào có giá trị là " + x);
        }
    }
}
