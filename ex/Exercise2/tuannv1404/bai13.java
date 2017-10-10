/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg2tuannv;
import java.util.Scanner;
/**
 *
 * @author TUAN
 */
public class bai13 {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[][]= new int[100][100];
        int n=0, m=0;
        System.out.println("nhap so hang: ");
        n=scanner.nextInt();
        System.out.println("nhap so cot: ");
        m=scanner.nextInt();
        Input(arr,n,m);
        Output(arr,n,m);
        int min = Min(arr,n,m);
        System.out.println("phan tu nho nhat la: "+min);
        int maxle = MaxLe(arr,n,m);
        System.out.println("phan tu le lon nhat la: "+maxle);
        int k = TimHangSumMax(arr,n,m);
         System.out.println("hang co tong max la hang so " +k);
     }
     public static void Input(int arr[][], int n, int m){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("arr["+i+"]"+"["+j+"]"+"=");
                arr[i][j]=scanner.nextInt();
            }
        }
    }
     public static void Output(int arr[][], int n, int m){
        System.out.println("ma tran vua nhap la: ");
        for(int i=0; i<n; i++){
            System.out.println("");
             for(int j=0; j<m; j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static int Min(int arr[][], int n, int m){
        int min=arr[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]<min)
                    min=arr[i][j];
            }
        }
        return min;
     }
    public static int MaxLe(int arr[][], int n, int m){
        int maxle=arr[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]>maxle && arr[i][j]%2!=0)
                    maxle=arr[i][j];
            }
        }
        return maxle;
    }
     public static int TimHangSumMax(int arr[][], int n, int m){
         int sum[]= new int[100];
         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sum[i]=0;
                sum[i] += arr[i][j];
            }
        }
         int max=sum[0];
         int k=0;
         for(int i=0; i<n; i++){
             if(sum[i]>max){
                 max=sum[i];
                 k=i;
             }
         }
         return k;
    }
}
