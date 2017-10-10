/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giai_thua_2;
import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Giai_thua_2 {

    /**
     * @param args the command line arguments
     */
    public static int n;
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        float Value2=1;
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập vào số n:");
        n= input.nextInt();
        for(int i=1;i<=n;i++)
        {
            Value2 +=i/Giaithua(i);
        }
        System.out.println("Tổng dãy số là:"+Value2);
    }
    public static double Giaithua(int n){
    double Value1=1;
    for(int i=1;i<=n;i++)
    {
        Value1 *=i;
    }
    return Value1;
    }
}
