/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.bai7;

/**
 *
 * @author haopv
 */
public class AOb {
    int f1;
    static int f2;
    A1Ob a1 = new A1Ob();

    public boolean aVariable;
    public void aMethod() { f1 = 1;  }

    public int getF1() {
        return f1;
    }

    public void setF1(int f1) {
        this.f1 = f1;
    }
    private void setl2F1(int f1) {
        this.setF1(f1);
    }

    public int getF2() {
        return f2;
    }

    public void setF2(int f2) {
        this.f2 = f2;
    }
    
    class A1Ob{
        int f3;
        void inManhinh(){
            System.out.println("f3: "+this.f3);
        }
    }
    
}
