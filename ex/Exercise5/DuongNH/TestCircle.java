/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B5.CSCircle;

/**
 *
 * @author Win7
 */
import static B5.CSCircle.Circle.*;
import java.util.Scanner;
public class TestCircle {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ban kinh duong tron muon tinh: ");
        float r = sc.nextFloat();
        
        ChuVi(r);
        
        DienTich(r);
                
    }
}
