/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win73
 */
import java.util.Scanner;
public class PTBacNhat {
    public static void main(String[] args){
       System.out.println("Nhap he so phuong trinh bac nhat(ax + b = 0)");
       float a = NhapHeSo("a = ");
       float b = NhapHeSo("b = ");
       
        GPTBac1(a, b);
    }
    
    // Ham nhap he so cho phuong trinh
    public static float NhapHeSo(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so "+str);
        float x = sc.nextFloat();sc.nextLine();
        return x;
    }
    
    //Ham giai phuong trinh bac nhat
    public static void GPTBac1(float a, float b){
        if(a==0){
            if(b==0)
                System.out.println("Phuong trinh co vo so nghiem!");
            else
                System.out.println("Phuong trinh vo nghiem!");
        }else{
            System.out.println("Phuong trinh co nghiem x = "+(-a/b));
        }
    }
}
