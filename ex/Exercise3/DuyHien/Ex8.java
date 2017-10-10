
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Ex8 {
    public static void delete(String a, char c) {
        for(int i = 0 ; i < a.length(); i++){
            char d = a.charAt(i);
            if(c == d){
                System.out.println("string after delete " + removeCharAt(a, i));
        }
    }

        
}
    public static String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 1);
   }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
         System.out.println("Enter String? ");
        String s = input.nextLine();
        System.out.println("Enter character you want to delete? ");
        char o = i.next().charAt(0);
        delete(s, o);
    }
}

