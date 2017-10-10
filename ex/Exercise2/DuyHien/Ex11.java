
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
public class Ex11 {
    public static boolean isPrime(int a){
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select = 0;

        try{
                System.out.println("Please enter a number to check: ");
                select = Integer.parseInt(new Scanner(System.in).nextLine());
            }catch (NumberFormatException e ){System.err.println("You need to enter an integer !!!");}{
                select = Integer.parseInt(new Scanner(System.in).nextLine());
            }
    
        if(isPrime(select)){
            System.out.println(select + " is a prime number. ");
        }else{
            System.out.println(select  + " is not a prime number. ");
        }
    }
}
