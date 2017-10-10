/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworke1.pkg1;

/**
 *
 * @author LENOVO
 */
public class Ex2 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 0; i < 20; i++){
            if(i % 2 == 0){
                total += i;
            }
        }
        System.out.println("The total number of 10 even number is: " +total);
    }
}
