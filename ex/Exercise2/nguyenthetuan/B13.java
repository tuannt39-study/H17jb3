package h17jb3.ex2;

import java.util.Scanner;

public class B13 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        System.out.print("Nhập m: ");
        m = sc.nextInt();
        int maTrix[][] = new int[n][m];
        //a
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print("Nhập phần tử thứ " + i + "." + j + " : ");
                maTrix[i][j] = sc.nextInt();
            }
        }
        //b
        System.out.println("Ma trận vừa tạo: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(maTrix[i][j] + " ");
            }
            System.out.println();
        }
        //c
        int min=maTrix[0][0], max=maTrix[0][0];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (maTrix[i][j]<min){
                    min=maTrix[i][j];
                } else if (maTrix[i][j]>max){
                    max=maTrix[i][j];
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if (maTrix[i][j]==max){
                    System.out.println("Phần tử có giá trị max = " + max + " là: " + i + "." + j);
                } else if (maTrix[i][j]==min){
                    System.out.println("Phần tử có giá trị min = " + min + " là: " + i + "." + j);
                }
            }
        }
        //d
        int leMax=1, lei=0, lej=0;
        for (int i=0; i<n; i++){
        	for (int j=0; j<m; j++){
        		if (maTrix[i][j]%2==1){
        			leMax = leMax > maTrix[i][j] ? leMax : maTrix[i][j];
        			lei=i;
        			lej=j;
        		}
        	}
        }
        System.out.println("Phần tử có giá trị lẻ lớn nhất = " + leMax + " là : " + lei + "." + lej);
        //e
        int tongMax=0, dongMax=0;
        for (int i=0; i<n; i++) {
        	int tong=0;
            for (int j=0; j<m; j++) {
                tong+=maTrix[i][j];
            }
            if (tongMax<tong){
                tongMax=tong;
                dongMax=i;
            }
            System.out.println("Dòng " + i + " có tổng là: " + tong);
        }
        System.out.println("Dòng " + dongMax + " có tổng lớn nhất = " + tongMax);
    }
}
