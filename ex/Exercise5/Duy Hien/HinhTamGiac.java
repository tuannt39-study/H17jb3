/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author LENOVO
 */
public class HinhTamGiac {

    private double mA;
    private double mB;
    private double mC;

    public HinhTamGiac(double mA, double mB, double mC) {
        if (validateMA(mA)) {
            this.mA = mA;
        } else {
            System.out.println("Negative value. Change this value " + mA + " = 0. ");
            this.mA = 0;
        }
        if (validateMB(mB)) {
            this.mB = mB;
        } else {
            System.out.println("Negative value. Change this value " + mB + " = 0. ");
            this.mB = 0;
        }
        if (validateMC(mC)) {
            this.mC = mC;
        } else {
            System.out.println("Negative value. Change this value " + mC + " = 0. ");
            this.mC = 0;
        }
        if (mA + mB <= mC || mA + mC <= mB || mB + mC <= mA) {
            System.out.println("Khong phai tam giac. Tat ca gia tri cua cac canh = 0. ");
            this.mA = this.mB = this.mC = 0;
        }
    }

    public double getCanhA() {
        return this.mA;
    }

    public double getCanhB() {
        return this.mB;
    }

    public double getCanhC() {
        return this.mC;
    }

    //set methods
    public void setCanhA(double mA) {
        if (validateMA(mA)) {
            this.mA = mA;
        } else {
            System.out.println("Negative value. Change this value " + mA + " = 0. ");
            this.mA = 0;
        }
    }

    public void setCanhB(double b) {
        if (validateMB(mB)) {
            this.mB = mB;
        } else {
            System.out.println("Negative value. Change this value " + mB + " = 0. ");
            this.mB = 0;
        }
    }

    public void setCanhC(double c) {
        if (validateMC(mC)) {
            this.mC = mC;
        } else {
            System.out.println("Negative value. Change this value " + mC + " = 0. ");
            this.mC = 0;
        }
    }

    public boolean repOK() {
        if (!validateMA(mA) || !validateMB(mB) || !validateMC(mC)) {
            return false;
        }
        return true;
    }

    public boolean validateMA(double mA) {
        if (mA < 0) {
            return false;
        }
        return true;
    }

    public boolean validateMB(double mB) {
        if (mB < 0) {
            return false;
        }
        return true;
    }

    public boolean validateMC(double mC) {
        if (mC < 0) {
            return false;
        }
        return true;
    }

    public double getChuvi() {
        return this.mA + this.mB + this.mC;
    }

    public double getDienTich() {
        double p = (double) (this.mA + this.mB + this.mC) / 2;
        return Math.sqrt(p * (p - this.mA) * (p - this.mB) * (p - this.mC));
    }

}
