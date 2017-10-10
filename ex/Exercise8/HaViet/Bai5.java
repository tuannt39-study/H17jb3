/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viet
 */
public class Bai5 {

    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ObjectOutputStream oos = null;
            try {
                oos = new ObjectOutputStream(new FileOutputStream("nhanvien.dat",false));
                Scanner in = new Scanner(System.in);
                NhanVien[] nv = new NhanVien[3];
                for (int i = 0; i < 3; i++) {
                    System.out.println("Nhan vien " + i);
                    System.out.print("Ma nhan vien : ");
                    int maNV = in.nextInt();
                    System.out.print("Ho ten : ");
                    String hoTen = in.nextLine();
                    in.nextLine();
                    System.out.print("Tuoi : ");
                    int tuoi = in.nextInt();
                    System.out.print("Luong : ");
                    int luong = in.nextInt();
                    nv[i] = new NhanVien(maNV, hoTen, tuoi, luong);
                    oos.writeObject(nv[i]);
                    oos.flush();
                }
            } catch (IOException ex) {
                Logger.getLogger(Bai5.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Bai5.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            // read object
            ois = new ObjectInputStream(new FileInputStream("nhanvien.dat"));
            while (true) {                
                Object obj =  ois.readObject();
                if ( obj == null)
                    break;
                NhanVien readNhanVien = (NhanVien) obj;
                System.out.println(readNhanVien.toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bai5.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Bai5.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
