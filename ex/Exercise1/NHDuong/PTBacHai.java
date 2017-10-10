/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win7
 */
import java.lang.Math;
import java.util.Scanner;
public class PTBacHai {
    public static void main(String[] args){
        float a = NhapHeSo("a = ");
        float b = NhapHeSo("b = ");
        float c = NhapHeSo("c = ");
        
        GPTBac2(a,b,c);
    }
    //Ham nhap he so cua phuong trinh bac hai
    public static float NhapHeSo(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so "+str);
        float x = sc.nextFloat();sc.nextLine();
        return x;
    }
    
    //Ham giai phuong trinh bac hai
    public static void GPTBac2(float a, float b, float c){
        if(a==0){
            if(b==0){
                if(c==0)
                    System.out.print("Phuong trinh vo so nghiem");//a=b=c=0
                else
                    System.out.print("Phuong trinh vo nghiem"); //a=b=0, c#0
            }else
                System.out.print("Phuong trinh co mot nghiem: x = "+(-c/b));//a=0,b,c#0
        }else{
            //Tinh delta
            double delta = b*b - 4*a*c;
            
            //
            if(delta==0){
                System.out.print("Phuong trinh co nghiem kep: x1 = x2 = "+(-b/(2*a)));
            }else if(delta>0){
                System.out.println("Phuong trinh co 2 nghiem thuc phan biet:");
                System.out.print("x1 = "+(-b+Math.sqrt(delta))/(2*a));
                System.out.print("x2 = "+(-b-Math.sqrt(delta))/(2*a));
            }else{//delta<0
                System.out.println("Phuong trinh co 2 nghiem ao phan biet:");
                System.out.print("x1 = "+(-b/(2*a))+" + i"+(Math.sqrt(-delta)/(2*a)));
                System.out.print("x1 = "+(-b/(2*a))+" - i"+(Math.sqrt(-delta)/(2*a)));
            }
        }
    }
}
