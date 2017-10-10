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
public class bai12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[]= new int[100];
        int n=0;
        System.out.println("nhap so phan tu mang: ");
        n=scanner.nextInt();
        Input(arr,n);
        Output(arr,n);
        int max= Max(arr,n);
        int min= Min(arr,n);
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        int count = Count(arr,n);
        System.out.println("mang co so phan tu chan la: "+count);
        TimNgtoArr(arr,n);
        BubbleSort(arr,n);
        int i= SearchX(arr,n);
        if(i==0)
            System.out.println("Not Found!");
        else
            System.out.println("phan tu ban tim o vi tri thu" +i);
    }
    public static void Input(int arr[], int n){
         Scanner scanner = new Scanner(System.in);
         for(int i=0; i<n; i++){
            System.out.println("arr["+i+"]"+"=" );
            arr[i]=scanner.nextInt();
        }
    }
    public static void Output(int arr[], int n){
        System.out.println("mang vua nhap la: ");
        for(int i=0; i<n; i++){
            System.out.println("\t"+arr[i]);
        }
    }
    public static int Max(int arr[], int n){
        int max=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max; 
    }
    public static int Min(int arr[], int n){
        int min=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min; 
    }
    public static int Count(int arr[], int n){
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0)
                count++;
        }
        return count;
    }
    public static int KtraNgto(int x){
        if(x==1 || x==2) return 1;
        for(int i=2; i<=x/2; i++){
            if(x%i==0) return 0;
        }
        return 1;
    }
    public static void TimNgtoArr(int arr[], int n){
        System.out.println("cac so nguyen to la: ");
        for(int i=0; i<n; i++){
            int x = KtraNgto(arr[i]);
            if(x==1)
                System.out.println("\t" +arr[i]);
            }
    }
    public static void BubbleSort(int arr[], int n){
        int t=0;
        for(int i=0; i<n-1; i++){
            for(int j=n-1; j>i; j--){
                if(arr[j] < arr[j-1]){
                    t=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println("mang sau khi sap xep la: ");
        for(int i=0; i<n; i++){
            System.out.println("\t"+arr[i]);
        }
    }
    public static int SearchX(int arr[], int n){
        Scanner scanner = new Scanner(System.in);
        int x=0;
        System.out.println("nhap phan tu ban muon tim: ");
        x=scanner.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i]==x)
                return i;
        }
        return 0;
    }
}
