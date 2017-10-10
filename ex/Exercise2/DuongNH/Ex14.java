/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2;

/**
 *
 * @author Win7
 */
import java.util.Scanner;
public class Ex14 {
    private static int A[][] = new int[10][10];
    private static int B[][] = new int[10][10];
    private static int n, m;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NhapMT(sc);
        System.out.println("Ma tran A");
        InMT(A);
        // Tinh gia tri lon nhat cua matran
        Max();
        //Ma tran so nguyen to
        SoNguyenTo();
        InMT(B);
        
    }
    
    // Nhap ma tran
    public static void NhapMT(Scanner sc){
        System.out.print("Nhap so hang ma tran m = ");
        n = sc.nextInt();sc.nextLine();
        System.out.print("Nhap so cot ma tran n = ");
        m = sc.nextInt();sc.nextLine();
        
        System.out.println("Nhap gia tri ma tran (0<A[i][j]<100)");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                do{
                    System.out.print("A["+i+"]["+j+"] = ");
                    A[i][j] = sc.nextInt();sc.nextLine();
                }while(A[i][j]>100 || A[i][j]<0);
            }
        }
    }
    
    //Ham in matran
    public static void InMT(int A[][]){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("\t"+A[i][j]);
            }
            System.out.println("\n");
        }
    }
    //Ham tinh max va chi so cua max
    public static void Max(){
        int Sln = A[0][0];
        int csi = 0;
        int csj = 0;
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(Sln < A[i][j]){
                    Sln = A[i][j];
                    csi = i;
                    csj = j;
                }
            }   
        }
        System.out.println("A["+csi+"]["+csj+"] = "+Sln+" la phan tu lon nhat cua ma tran");
    }
    
    // So nguyen to
    public static void SoNguyenTo(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                byte flag = 0;
                for(int k=2;k<=A[i][j]/2;k++){
                    if(A[i][j]%k==0){
                        flag = 1;
                        B[i][j] = 0;
                        break;
                    }
                }
                if(flag == 0)
                    B[i][j] = A[i][j];
            }
        }
    }
}