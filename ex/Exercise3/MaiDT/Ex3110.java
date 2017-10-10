/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.pkg1;

import java.util.Scanner;


/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Ex3110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào xâu ký tự:");
        String str = input.nextLine();
        String [] spt= str.split(" ");
        StringBuilder kq= new StringBuilder();
        for (int i=0; i< spt.length;i++)
        { 
            kq=kq.append(spt[spt.length-i-1]).append(" ");
        }
        System.out.println("Xâu kết quả cần in là:"+kq);
    }

}
