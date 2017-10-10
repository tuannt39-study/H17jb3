/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giai_ptb1;
import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Giai_PTB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int a,b;
        a=NhapSoNguyen("Nhập hệ số a:");
        b=NhapSoNguyen("Nhập hệ số b:");
        GiaiPTB1(a,b);
    }
    public static int NhapSoNguyen(String str)
    {
        int x;
        Scanner z= new Scanner(System.in);
        System.out.println(str);
        x=z.nextInt();
        return x;
    }
    public static void GiaiPTB1( int a, int b)
    {
        if(a==0)
        {
            if(b==0)
                System.out.println("Phương trình có vô số nghiệm!");
            else
                System.out.println("Phương trình vô nghiệm!");
        }
        else
            System.out.println("Phương trình có nghiệm = "+(-b/a));
    }
    

}
