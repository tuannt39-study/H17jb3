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
public class student {
    private String firstName;
    private String lastName;
    private Address homeAddress;
    private Address schoolAddress;

    public student(String fristName, String lastName, part7OOP.Address homeAddress, part7OOP.Address schoolAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public part7OOP.Address getHomeAddress() {
        return homeAddress;
    }

    public part7OOP.Address getSchoolAddress() {
        return schoolAddress;
    }
    @Override
    public String toString(){
    return "Student: " + this.getFirstName() + " " + this.lastName + "\n Home Address: " + this.getHomeAddress().toString() + "\n School Address: " + this.getSchoolAddress();
    }
}
