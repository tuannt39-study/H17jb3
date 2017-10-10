/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viet
 */


public class Bai4 {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            FileWriter fw = null;
            try {
                Scanner in = new Scanner(System.in);
                NhanVien[] nv = new NhanVien[3];
                fw = new FileWriter("nhanvien.txt", false);
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
                    fw.write(nv[i].toString());
                    fw.flush();
                }
            } catch (IOException ex) {
                Logger.getLogger(Bai4.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Bai4.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //doc file
            fr = new FileReader("nhanvien.txt");
            BufferedReader bf = new BufferedReader(fr);
            while (true) {
                String str = bf.readLine();
                if (str == null) {
                    break;
                }
                System.out.print(str);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai4.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Bai4.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
