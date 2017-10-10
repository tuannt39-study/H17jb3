/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        //Tao mang doi tuong gom 3 nv
        NhanVien7[] nv = new NhanVien7[3];
        for (int i = 0; i < nv.length; i++) {
            nv[i] = new NhanVien7();
            nv[i].addFromType();

            // ghi thong tin vao nhanvien.txt
//            try {
//                DataOutputStream file = new DataOutputStream(new FileOutputStream("D:/nhanvien.txt"));
//                nv[0].writeNV(file);
////                nv[1].writeNV(file);
////                nv[2].writeNV(file);
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(Ex7.class.getName()).log(Level.SEVERE, null, ex);
//
//            } catch (IOException ex) {
//                Logger.getLogger(Ex7.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (Exception ex) {
//                System.out.println("Ket thuc");
//            }
//            FileInputStream finput;
//            //Dọc và ghi file ra ngoai man hinh.
//            try {
//                FileReader reader = new FileReader(new File("D:/nhanvien.txt"));
//                BufferedReader br = new BufferedReader(reader);
//                String str = br.readLine();
//                System.out.println(str);
//            } catch (Exception e) {
//            }
                writeObject();
        }

    }

    public static void writeObject() throws IOException, ClassNotFoundException {
        try {
            ObjectOutputStream ouS = new ObjectOutputStream(new FileOutputStream("D:/nhanvien.dat"));
            NhanVien7[] nv = new NhanVien7[1];
            for (int i = 0; i < nv.length; i++) {
                nv[i] = new NhanVien7();
                nv[i].addFromType();
                ouS.writeObject(nv[0]);
//                ouS.writeObject(nv[1]);
//                ouS.writeObject(nv[2]);
                ObjectInputStream inS = new ObjectInputStream(new FileInputStream("D:/nhanvien.dat"));
                NhanVien7 nv1 = (NhanVien7) inS.readObject();
                ouS.close();
            }}catch (FileNotFoundException ex) {
           // Logger.getLogger(VnHackademicH17jb3Stream.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    }
