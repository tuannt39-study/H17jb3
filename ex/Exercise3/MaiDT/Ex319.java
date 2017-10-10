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
public class Ex319 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào xâu ký tự:");
        String str = input.nextLine();
      // Chuyen xau thanh mang 
      char[] str2=str.toCharArray();
      //Doi vi tri cac ky tu o 2 dau
      for(int i=0;i<str.length()/2;i++)
      {
          char temp=str2[i];
          str2[i]= str2[str2.length-i-1];
          str2[str2.length-i-1]= temp;
      }
      // Chuyen mang thanh xau
      String kq= String.valueOf(str2);
        System.out.println("Xâu đối xứng với xâu vừa nhập là:"+kq);
    }

}
