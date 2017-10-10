/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author ThaoJ
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int i;
        int tong =0;
        for( i = 0 ; i <= n; i++){
            if(i % 2 == 0){
                
            tong = tong + i;
            }
            
        }
        System.out.println("Tổng số chẵn <10 la" + tong );
    }
    
}
