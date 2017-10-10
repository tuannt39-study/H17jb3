/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tong_1_n;
import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Tong_1_n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n;
        float tong = 0.0f;
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập vào số n:");
        n= input.nextFloat();
        for(int i=1;i<=n;i++)
        {
            tong +=(float)1/i;
        }
        System.out.println("Tổng các chứ số từ 1 đến "+1/n+" là: "+tong);
                
    }
    
}
