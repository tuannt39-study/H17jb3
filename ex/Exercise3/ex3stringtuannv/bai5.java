/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3stringtuannv;
import java.lang.String;
import java.util.Scanner;
/**
 *
 * @author TUAN
 */
public class bai5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=" ";
        int tu=0, chucai=0, so=0;
        System.out.println("nhap chuoi: ");
        str= scanner.nextLine();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
                tu++;
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                chucai++;
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                so++;
        }
        if(str.charAt(0)!=' ')
            tu++;
        System.out.println("co " +tu+ " tu trong chuoi");
        System.out.println("co " +chucai+ " chu cai trong chuoi");
        System.out.println("co " +so+ " so trong chuoi");
    }
}
