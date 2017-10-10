package Excersice_5.ex_7;

/**
 * Created by minht on 5/9/2017.
 */
public class Student {
    private String firstName, lastname;
    private Address homeAddress,schoolAddress;

    public Student() {
    }

    public Student(String firstName, String lastname, Address homeAddress, Address schoolAddress) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(Address schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
}
