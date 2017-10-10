/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author viet
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,tong,dem;
        i = 0 ;
        tong = 0;
        dem = 0;
        
        while ( dem != 10 )
        {
            i++;
            if ( i % 2 == 0)
            {
                tong += i;
                dem +=1 ;
            }
        }
        System.out.println("Tong cua 10 so chan dau tien la : " +tong);
    }
}
