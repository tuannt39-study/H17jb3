/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part7OOP;

/**
 *
 * @author LilyEvans
 */
class Address {

    private String streetAddress;
    private String city;
    private String state;
    private long zipCode;

    public Address(String streetAddress, String city, String state, long zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public long getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return this.getStreetAddress() + this.getCity() + this.getState() + this.getZipCode();
    }
}
