/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinh_tong_n;
import java.util.Scanner;
/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Tinh_Tong_n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        double tong = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào n:");
        n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
           tong +=i;
        }
         System.out.println("Tổng các chữ chỗ từ 1 đến " + n + " la:"+tong);
    }
    
}
