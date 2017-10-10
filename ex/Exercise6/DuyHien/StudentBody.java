/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author LENOVO
 */
public class StudentBody {

    private ArrayList<Student> sts = new ArrayList<Student>();

    public void createStudent() {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Lets create a new Student !");
        System.out.println("Enter first name of student: ");
        String fn = sc.nextLine();
        System.out.println("Enter last name of student: ");
        String ln = input.nextLine();
        System.out.println("We need the informations about home address of Student: ");
        System.out.println("What about street address? ");
        String sa = sc.nextLine();
        System.out.println("What about city? ");
        String ct = input.nextLine();
        System.out.println("State? ");
        String stt = sc.nextLine();
        long zC = 0;
        try {
            System.out.println("What about zipCode ? ");
            zC = input.nextLong();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        Address ad1 = new Address(sa, ct, stt, zC);
        System.out.println("We need the informations about school address of Student: ");
        System.out.println("What about street address? ");
        String sa1 = sc.nextLine();
        System.out.println("What about city? ");
        String ct1 = input.nextLine();
        System.out.println("State? ");
        String stt1 = sc.nextLine();
        long zC1 = 0;
        try {
            System.out.println("What about zipCode ? ");
            zC1 = input.nextLong();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        Address ad2 = new Address(sa, ct, stt, zC);
        Student a = new Student(fn, ln, ad1, ad2);
        sts.add(a);
    }

    public void displayStudent() {

        for (int i = 1; i <= sts.size(); i++) {
            System.out.print(i);
            System.out.print(sts.get(i - 1).toString() + "\n");
        }

    }

    public static void main(String[] args) {
        StudentBody prog = new StudentBody();
        Scanner sc = new Scanner(System.in);
        char select = 0;
        do {
            prog.createStudent();

            System.err.println("Do you want to continue? (Y or N) ?");
            String ask = sc.nextLine();
            while (!ask.equalsIgnoreCase("Y") && !ask.equalsIgnoreCase("N")) {
                System.err.println("Please enter a character Y or N ! ");
                ask = sc.nextLine();
            }
            select = ask.toUpperCase().charAt(0);

        } while (select == 'Y' || select == 'y');
        if (prog.sts.size() == 0) {
            System.err.println("Data about PC is empty. Can't display report, modify or save information of PC ! ");
            System.exit(0);
        }
        System.out.println("OK. Here is the report ! ");
        prog.displayStudent();
    }
}
