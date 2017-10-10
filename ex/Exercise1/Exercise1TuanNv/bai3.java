/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1.pkg1;

/**
 *
 * @author TUAN
 */
import java.util.Scanner;//khai bao thu vien nhap du lieu tu ban phim
public class bai3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);// tao mot doi tuong scanner moi
        float a=0;
        float b=0;
        System.out.println("nhap a= ");
        a=scanner.nextFloat();// giong nhu scanf trong c
        System.out.println("nhap b= ");
        b=scanner.nextFloat();
        if(a==0){
            System.out.println("khong phai phuong trinh bac nhat");
        }else{
            System.out.println("nghiem la x= "+-b/a);
        }
    }
}
