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
public class Ex12 {
    private static int C[] = new int[10];
    private static int D[] = new int[10];
    private static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Nhap so phan tu cua mang
        n = NhapGT(sc, "Nhap so phan tu cua mang n = ");
        for(int i=0;i<n;i++){
            C[i] = NhapGT(sc,"Phan tu thu a["+i+"] = ");  
        }
        
        //Xuat mang        
        XuatGTMang(C,"Cac phan tu cua mang: ");
        // Tim max, min trong mang
        MaxMin();
        //Dem so phan tu chan trong mang
        System.out.println("Co "+(DemSoChan()+" so chan trong mang"));
        
        //Tim cac phan tu la so nguyen to trong mang
        System.out.println("Cac so nguyen to trong mang: ");
        SoNguyenTo();
        
        // Sap xep mang theo chieu tang dan
        SXTang();
        XuatGTMang(D,"\nMang sau khi da sap xep tang dan: ");
        
        //Tim phan tu co gia tri x
        int x = NhapGT(sc,"\nNhap gia tri muon tim trong mang x = ");
        TimKiem(D, x);
    }
    //Ham nhap gia tri
    public static int NhapGT(Scanner sc, String str){
        System.out.print(str);
        int n = sc.nextInt();sc.nextLine();
        return(n);
    }
    
    // Xuat gia tri cac phan tu cua mang
    public static void XuatGTMang(int a[],String str){
        System.out.println(str);
        for(int i=0;i<n;i++){
            System.out.print("\t"+ C[i]);
        }
    }
    
    // Ham tim gia tri max, min cua mang
    public static void MaxMin(){
        int Sln = C[0];
        int Snn = C[0];
        for(int i=1;i<n;i++){
            Sln = Sln > C[i]? Sln:C[i];
            Snn = Snn < C[i]? Snn:C[i];
        }
        System.out.println("\nGia tri lon nhat cua mang la: "+ Sln);
        System.out.println("Gia tri nho nhat cua mang la: "+ Snn);
    }
    // Dem phan tu la so chan
    public static int DemSoChan(){
        int dem = 0;
        for(int i=0;i<n;i++){
            if(C[i]%2 == 0)
                dem++;
        }
        return(dem);
    }
    
    //Tim phan tu la so nguyen to
    public static void SoNguyenTo(){
        for(int i=0;i<n;i++){
            byte flag = 0;
            for(int j=2;j<=C[i]/2;j++){
                if(C[i]%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                System.out.print("\t"+C[i]);
        }
    }
    
    //Sap xep mang tang dan
    public static void SXTang(){
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(C[j]<C[j-1])
                    DoiCho(C[j], C[j-1]);
            }
            D[i]=C[i];
        }
    }
    
     //Ham doi cho
    public static void DoiCho(int a, int b){
        int tg;
        tg = a;
        a = b;
        b = tg;
    }
    
    // Ham tim kiem (ap dung cho day da sap xep)
    public static void TimKiem(int b[],int x){
        System.out.println(n);
        int vt = n/2;
        while(x!=b[vt] && vt>1 &&vt<n ){
            if(x<b[vt])
                vt /=2;
            else
                vt += (n - vt)/2;
        }
        System.out.println(vt);
        if(vt<1 || vt>n)
            System.out.println(x +" khong ton tai trong mang!");
        else
            System.out.println(x+" o vi tri thu "+ (vt-1) +" trong mang!");
    }
    
}
