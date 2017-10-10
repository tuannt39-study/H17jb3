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
public class Ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        int n = sc.nextInt();sc.nextLine();
        
        byte flag = 0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println(n+" la so nguyen to");
        else
            System.out.println(n+" khong phai so nguyen to");
    }
}
