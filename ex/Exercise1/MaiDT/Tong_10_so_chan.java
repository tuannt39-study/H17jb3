/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tong_10_so_chan;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Tong_10_so_chan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tong = 0;
        for(int i=0;i<10; i++)
        {
            tong +=i*2;
        }
        System.out.println("Tổng 10 số chẵn đầu tiên là :"+tong);
    }
    
}
