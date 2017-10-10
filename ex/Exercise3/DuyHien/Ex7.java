/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().trim();
        StringBuilder a = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' ') a.append(str.charAt(i));
            else if(str.charAt(i)==' '){
                a.append(' ');
                while(str.charAt(i)==' ') 
                i++;
            }
        }

        System.out.println(a);       
    } 
}

