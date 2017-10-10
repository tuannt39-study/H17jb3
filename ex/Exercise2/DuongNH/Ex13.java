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
public class Ex13 {
    private static int A[][] = new int[10][10];
    private static int n,m;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NhapMT(sc);
        //In ma tran
        System.out.println("Ma tran A");
        InMT();
        
        //Tim phan tu nho nhat
        System.out.println("Gia tri nho nhat cua ma tran la: "+ Min());
        
        //Tim phan tu le lon nhat
        System.out.println("Gia tri le lon nhat cua ma tran la: "+ MaxLe());
        
        //Dong co tong lon nhat
        System.out.println("Dong co tong lon nhat la dong thu"+ TongDong());
    }
    
    // Ham nhap ma tran
    public static void NhapMT(Scanner sc){
        System.out.print("Nhap so hang ma tran m = ");
        n = sc.nextInt();sc.nextLine();
        System.out.print("Nhap so cot ma tran n = ");
        m = sc.nextInt();sc.nextLine();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = sc.nextInt();
            }
        }
    }
    
    //Ham in ma tran
    public static void InMT(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("\t"+A[i][j]);
            }
            System.out.println("\n");
        }
    }
    
    // Tim phan tu nho nhat
    public static int Min(){
        int Snn = A[0][0];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                Snn = Snn < A[i][j]? Snn:A[i][j];
            }
        }
        return(Snn);
    }
    
    // Tim phan tu le lon nhat
    public static int MaxLe(){
        int ml = 1;
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(A[i][j]%2 == 1)
                    ml = ml > A[i][j]? ml:A[i][j];
            }
        }
        return(ml);
    }
    
    // Tim dong co tong lon nhat
    public static int TongDong(){
        int Tln=0;
        int Dtm=0;
        for(int i=0;i<n;i++){
            int Tong=0;
            for (int j=0;j<m;j++){
                Tong += A[i][j];
            }
            if(Tln<Tong){
                Tln = Tong;
                Dtm = i;
            }
        }
        return(Dtm);
    }
    
    //
}
