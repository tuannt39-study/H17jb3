/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworke1.pkg1;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Ex7 {
    public static void Fact(int a){
        int cal = 1;
        for(int i = 1; i <= a; i++){
            cal = cal * i;
        }
        System.out.println("The factorial of " +a + " is : " +cal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Enter your number to calculate its factorial : ");
        num1 = sc.nextInt();
        Fact(num1);
    }
}
