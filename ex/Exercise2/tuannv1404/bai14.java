/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg2tuannv;
import java.util.Scanner;
/**
 *Muon sap xep ma tran thi phai //Change(arr,n,m)
 * @author TUAN
 */
public class bai14 {
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
        SearchLocationMax(arr,n,m);
        Change(arr,n,m);
        BubbleSort(arr,n,m);
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
    public static int SearchMax(int arr[][], int n, int m){
        int max=arr[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]>max)
                    max=arr[i][j];
            }
        }
        return max;
    }
    public static void SearchLocationMax(int arr[][], int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==SearchMax(arr,n,m))
                    System.out.println("phan tu max o hang "+i+" cot "+j+" la arr["+i+"]["+j+"]=" +arr[i][j]);
            }
        }
    }
    public static int KtraNgto(int x){
        if(x==1 || x==2) return 1;
        for(int i=2; i<=x/2; i++){
            if(x%i==0) return 0;
        }
        return 1;
    }
    public static void Change(int arr[][], int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int x = KtraNgto(arr[i][j]);
                if(x==0){
                    arr[i][j]=0;
                }
            }
        }
        System.out.println("ma tran sau khi thay doi la: ");
        for(int i=0; i<n; i++){
            System.out.println("");
            for(int j=0; j<m; j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static void BubbleSort(int arr[][], int n, int m){
        for(int i=0;i<m;i++)
            for(int j=0;j<n-1;j++)
                for(int k=n-1;k>j;k--)
                    if (arr[k][i] < arr[k-1][i]){
                        int temp=arr[k-1][i];
                        arr[k-1][i]=arr[k][i];
                        arr[k][i]=temp;
                    }
        System.out.println("ma tran sau khi sap xep la: ");
        for(int i=0; i<n; i++){
            System.out.println("");
             for(int j=0; j<m; j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println("");
        }
    }
}
