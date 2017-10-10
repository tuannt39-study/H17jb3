/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuoi;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

/**
 *
 * @author viet
 */
public class Bai9 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        String chuoi = "";
        //Input
        try {
            System.out.print("Nhap chuoi : ");
            chuoi = in.nextLine();
        } catch (Exception e) {
            System.out.println("Error !");
        }
        //
        for ( int i = chuoi.length() - 1 ; i >= 0 ; i-- )
           System.out.print(chuoi.charAt(i));
        
    }
}
