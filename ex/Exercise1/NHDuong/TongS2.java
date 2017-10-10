/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win7
 */
//Tinh tong 1+1/2+...+1/n n nhap tu ban phim
import java.util.Scanner;
public class TongS2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon tinh tong bao nhieu phan so? => n = ");
        int n = sc.nextInt();sc.nextLine();
        
        float TongPS = 1;
        for(int i=2;i<=n;i++){
            TongPS += (float)1/i;
        }
        System.out.println("Tong "+n+"phan so 1/n = "+TongPS);
    }
}
