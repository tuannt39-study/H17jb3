/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author ThaoJ
 */
public class Address extends Student{
    String streetAddress;
    String city;
    String state;
    long zipCode;

    @Override
    public String toString() {
        return "Dia chi duong : " + streetAddress + ", Thanh pho : " + city + ", quan/huyen : " + state + ", zipCode : " + zipCode + '}';
    }
    
}
