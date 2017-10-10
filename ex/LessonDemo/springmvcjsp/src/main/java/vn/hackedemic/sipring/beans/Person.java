/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackedemic.sipring.beans;

/**
 *
 * @author haopv
 */
public class Person {
    private String name;
    private String code;
    private int age;

    public Person() {
    }
    
    public Person(String name, String code,int age) {
        this.name = name;
        this.code = code;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
}
