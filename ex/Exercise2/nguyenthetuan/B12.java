package h17jb3.ex2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class B12 {

    protected static int laNT(int n){
        int dem=0;
        for (int i=1; i<=sqrt(n); i++){
            if (n<2){
                return 0;
            }
            else if (n%i==0){
                dem++;
            }
        } if (dem>=2) return 0;
        else return 1;
    }

    //Sắp xếp nổi bọt (bubble sort)
    protected void bubbleSort(int array[], int n){
        for (int i=0; i<n; i++){
            for (int j=n-1; j>i; j--){
                if (array[j]<array[j-1]){
                    int t = array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            } System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        B12 sapXep = new B12();
        System.out.print("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int[] pt = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            pt[i] = sc.nextInt();
        }

        System.out.print("Mang vua tao: ");
        for (int i=0; i<pt.length; i++){
            System.out.print(" " + pt[i] + " ");
        }

        int min, max;
        min=max=pt[0];
        for (int i=0; i<pt.length; i++){
            if (pt[i]<min){
                min=pt[i];
            }
            if (pt[i]>max){
                max=pt[i];
            }
        }
        System.out.println();
        for (int i=0; i<n; i++){
            if (pt[i]==max){
                System.out.println("Phan tu co gia tri max = " + max + " la: " + i);
            } else if (pt[i]==min){
                System.out.println("Phan tu co gia tri min = " + min + " la: " + i);
            }
        }

        int dem=0;
        for (int i=0; i<pt.length; i++){
            if (pt[i]%2==0){
                dem++;
            }
        }
        System.out.println("So phan tu chan la: " + dem);

        for (int i=0; i<pt.length; i++){
            if (laNT(pt[i])==1){
                System.out.println("Phan tu " + i + " co gia tri " + pt[i] + " la so nguyen to");
            }
        }

        System.out.println("Mang da duoc sap xep");
        sapXep.bubbleSort(pt, pt.length);

        System.out.println("\nNhap x: ");
        x = sc.nextInt();
        for (int i=0; i<n; i++){
            if (pt[i]==x){
                System.out.println("Phan tu co gia tri = " + x + " la: " + i); break;
            }
        }
    }
}
