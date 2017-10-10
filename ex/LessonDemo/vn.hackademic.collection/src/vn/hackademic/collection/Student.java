/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection;

/**
 *
 * @author haopv
 */
public class Student implements Comparable{
    private String roleNo;
    private String name;

    public Student(String role, String name) {
        this.roleNo = role;
        this.name = name;
    }
    
    public String getRole() {
        return roleNo;
    }

    public void setRole(String role) {
        this.roleNo = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /*
    @Override
    public int hashCode(){
        int hash = 10;
        hash = Object.hashCode(this.roleNo) + 1+ hash;
        return hash;
    }*/
    
    @Override
    public int hashCode() {
            int hash = 2;
            hash += (this.roleNo != null ? this.roleNo.hashCode() : 0);
            return hash;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Student other = (Student)obj;
        return this.roleNo.equals(other.roleNo);
    }
    
    
    @Override
    public String toString(){
        return "Student - "+" rolNo: "+ roleNo + ", name: "+name+". ";
    }

    
    
    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student s = (Student)o;
            return this.roleNo.compareTo(s.roleNo);
        }
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*
    @Override
    public int compareTo(Object o) {
        if(o instanceof Std){
            Student s = (Student)o;
            return this.roleNo.compareTo(s.roleNo);
        }
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}

