/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex7;

/**
 *
 * @author Win7
 */
import java.util.Scanner;
public class Address {
    String streetAddress;
    String city;
    String state;
    long zipCode;
    
    Address(){}
    Address(String sA, String ct, String St, long zC){
        this.streetAddress = sA;
        this.city = ct;
        this.state = St;
        this.zipCode = zC;
    }
    
    public void In(String str){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dia chi"+str+": ");
        streetAddress = sc.nextLine();
        city = sc.nextLine();
        state = sc.nextLine();
        zipCode = sc.nextLong();sc.nextLine();
    }
    @Override
    public String toString(){
        return (streetAddress +","+ city +","+ state +","+ zipCode);
    }
}
