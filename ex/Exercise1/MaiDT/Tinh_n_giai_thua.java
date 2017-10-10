/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinh_n_giai_thua;
import java.util.Scanner;
/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Tinh_n_giai_thua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        double Value =1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số n:");
        n= input.nextInt();
        for(int i =1;i<=n;i++)
        {
            Value *=i;
        }
        System.out.println("Tổng dãy từ 1 đến "+n+"! là:"+Value);
    }
    
}
