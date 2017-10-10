package Excersice_5.ex_7;

/**
 * Created by minht on 5/9/2017.
 */
public class Address {
    private String streetAddress,city,state;
    private long zipCode;

    public Address() {
    }

    public Address(String streetAddress, String city, String state, long zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }
    public String toString(){
        return "the address is :"+streetAddress+ " city :"+city+" state "+state;
    }
}
