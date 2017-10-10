/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_1;

import com.sun.javafx.geom.AreaOp;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        String s;
        Scanner input=new Scanner(System.in);
//         System.out.print("Nhập vào số 1:");
//        while (true) {
//            try{
//               
//                s = input.nextLine();
//                a = Integer.parseInt(s);
//                break;
//            }catch(NumberFormatException ex){
//                System.out.println("Nhap lai ");
//            }
//        }
//        while (true) {
//            try{
//                System.out.print("Nhập vào số 2:");
//                 s = input.nextLine();
//                b= Integer.parseInt(s);
//                break;
//            }catch(Exception ex){
//                
//            }   
//        }
        int[] A = new int[100];
        for (int j = 0; j <100; j++ ){
          
            A[j] = (int) Math.round(1 / Math.random());
        }
        try{
        System.out.println("Nhap vao chi so cua mang A:");
      int index = input.nextInt();
      
        System.out.println(A[index]);}catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Loi"+ae.toString());}
      
        
        
        //System.out.println(a+b);
//        try{
//            System.out.print("Nhập vào tử số:");
//            a=input.nextInt();
//            System.out.print("Nhập vào mẫu số:");
//            b=input.nextInt();
//            c=a/b;
//            System.out.println("Kết quả:"+c);
//            String s = input.next();
//            System.out.println(s);
//       }
//        catch(ArithmeticException ae){
//          System.out.println("Lỗi chia 0"+ae.getMessage());
//       }
//        catch(InputMismatchException ie){
//            System.out.println("Lỗi nhập chữ:"+ie.getMessage());
    /*  try{
            String str = input.nextLine();
            
//            int x = input.nextInt();
//            String ope = input.next();
//            int y = input.nextInt();
//            System.out.print(x + " " + y + " = ");
            if (ope=="+") System.out.print( x + y);
            else if (ope == "-") System.out.print( x - y);
                    
        }catch(NumberFormatException ex){
            System.out.println("loi");
        }*/
    }
    
}
