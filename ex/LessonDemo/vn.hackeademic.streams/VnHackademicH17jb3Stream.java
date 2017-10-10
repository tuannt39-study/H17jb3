/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.h17jb3.stream;

import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haopv
 */
public class VnHackademicH17jb3Stream {

    
    
    public static void readBytes() throws IOException{
        byte data[] = new byte[10];
        
        System.out.print("Nhap vai ky ky: ");
        System.in.read(data);
        
        for(int i = 0 ; i< data.length; i++){
            System.out.print((char)data[i]);
            
        }
    }
    
    public static void writeDemo() {
        int b;
        b = 'x';
        //b = 120;
        System.out.write(b);
        System.out.write('\n');
    }
    
    public static void showFile(){
        FileInputStream fin;
        int i;
        File fIn = new File("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/txt.txt");
        if(fIn.exists())
            System.out.println(" tìm thấy file");
        try {
            fin = new FileInputStream(fIn);
            char ind = 0;
            /*do {
                i = fin.read();
                if (i != -1){
                    System.out.print((char)i);
                }
                if(ind >2) break;
                ind ++;
            }while (i != -1);*/
            int gt1 = fin.read(); System.out.print("gt1: "+gt1);
            int gt2 = fin.read(); System.out.print(" gt2: "+gt2);
            int gt = gt1*256+gt2;
            System.out.print("gt: ");
            System.out.write(gt);
            fin.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Ko tim thay file");
            //Logger.getLogger(VnHackademicH17jb3Stream.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
                Logger.getLogger(VnHackademicH17jb3Stream.class.getName()).log(Level.SEVERE, null, ex);
            }
        finally{
            
            System.out.println("\ndon dep");
        }
        
        
    }
    
    //Kết quả, chương trình sẽ copy nội dung của file \source.txt và ghi vào một file mới \dest.txt.
    public static void copyFile() throws IOException {
        int i;
        byte [] bArr = new byte [100];
        
        String input = "chuoi dau vao moi nhất";
        for (int in = 0 ; in < input.length();in ++){
            bArr[in] = (byte)input.charAt(in); 
        }
        
        
        FileInputStream fin;
        FileOutputStream fout;
        try { // open input file
            
            fin = new FileInputStream("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/txt.txt");
            //fin = new FileInputStream(input);
            // open output file
            
            fout = new FileOutputStream("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/txt_out.txt");
           //do {
           //     i = fin.read();
           //     if (i != -1) {
           //         fout.write(i);
           //     }
            //} while (i != -1);
            
            fout.write(bArr, 0, input.length());
         
           fin.close();
            fout.close();
        //} catch (FileNotFoundException exc) {
        //    System.out.println("Input File Not Found yes");
             //return;
      } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Usage: CopyFile From To");
            //return;
        }
        
        System.out.println("OK");
        
    }
    
    
    
    // Doc ghi du lieu nhi phan
    public static void rWData() throws IOException {
        DataOutputStream dataOut;
        DataInputStream dataIn;
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        try {
            dataOut = new DataOutputStream(new FileOutputStream("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/testdata.dat"));
        } catch (IOException exc) {
            System.out.println("Cannot open file.");
            return;
        }
        try {
            System.out.println("Writing " + i);
            dataOut.writeInt(i);
            System.out.println("Writing " + d);
            dataOut.writeDouble(d);
            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);
            //System.out.println("Writing " + 12.2 * 7.4);
            //dataOut.writeDouble(12.2 * 7.4);
        } catch (IOException exc) {
            System.out.println("Write error.");
        }
        dataOut.close();
        System.out.println();
        // Now, read them back.
        try {
            dataIn = new DataInputStream(
                    new FileInputStream("/Volumes/Data/works/java/edu/file/testdata.dat"));
        } catch (IOException exc) {
            System.out.println("Cannot open file.");
            return;
        }
        try {
            
            b = dataIn.readBoolean();
            System.out.println("Reading " + b);
            i = dataIn.readInt();
            System.out.println("Reading " + i);
            d = dataIn.readDouble();
            System.out.println("Reading " + d);
            d = dataIn.readDouble();
            System.out.println("Reading " + d);
        } catch (IOException exc) {
            System.out.println("Read error.");
        }

        dataIn.close();
    }
    public static void randomAccessDemo() throws IOException {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;
        RandomAccessFile raf;
        try {
            raf = new RandomAccessFile("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/random.dat", "rw");
        } catch (FileNotFoundException exc) {
            System.out.println("Cannot open file.");
            return;
        }
        // Write values to the file.
        for (int i = 0; i < data.length; i++) {
            try {
                raf.writeDouble(data[i]);
            } catch (IOException exc) {
                System.out.println("Error writing to file.");
                return;
            }
        }

        try { // Now, read back specific values
            raf.seek(0); // seek to first double
            d = raf.readDouble();
            System.out.println("First value is " + d);
            raf.seek(8); // seek to second double
            d = raf.readDouble();
            System.out.println("Second value is " + d);
            raf.seek(8*3); // seek to fourth double
            d = raf.readDouble();
            System.out.println(" 4th value is " + d);
            System.out.println();
            // Now, read every other value.
            System.out.println("Here is every other value: ");
            for (int i = 0; i < data.length; i += 3) {
                raf.seek(8 * i); // seek to ith double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
            System.out.println("\n");
        } catch (IOException exc) {
            System.out.println("Error seeking or reading.");
        }
        raf.close();
    }
    
    public static void readChars() throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap chuoi ky tu, gioi han dau cham '.': ");
        // read characters
        do {
            c = (char) br.read();
            System.out.print(c);
        } while (c != '.');
    }
    
    public static void readLines() throws IOException {
        // create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Nhap chuoi.");
        System.out.println("Nhap 'stop' ket thuc chuong trinh: ");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
    
    
    public static void writeFileStreamChar() throws IOException {
        String str;
        FileWriter fw;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            fw = new FileWriter("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/streamchar.txt");
        } catch (IOException exc) {
            System.out.println("Khong the mo file.");
            return;
        }
        System.out.println("Nhap ('stop' de ket thuc chuong trinh).");
        do {
            System.out.print(": ");
            str = br.readLine()+"";
            if (str.compareTo("stop") == 0) {
                break;
            }
            str = str + "\n";
            fw.write(str);
        } while (str.compareTo("stop") != 0);
        fw.close();
    }
    
   
    
    public static void readFileStreamChar() throws Exception {
        FileReader fr = new FileReader("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/streamchar.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        fr.close();
        br.close();
    }
    
    
    public static void writeObject() throws IOException, ClassNotFoundException{
        try {
            ObjectOutputStream ouS = new ObjectOutputStream(new FileOutputStream("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/obdata.dat"));
            Circle c1 = new Circle(10,100.0);
            Circle c2 = new Circle(11,200.0);
            ouS.writeObject(c1);
            ouS.writeObject(c2);
            
            ObjectInputStream inS = new ObjectInputStream(new FileInputStream("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/obdata.dat"));
            
            Circle co1 = (Circle) inS.readObject();
            Circle co2 = (Circle) inS.readObject();
            //while()
            System.out.println("c01: "+ co1.toString() +" nhap d.tich: " +co1.Area);
            System.out.println("c02: "+ co2.toString()+ " nhap d.tich: " +co2.Area);
            
            ouS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VnHackademicH17jb3Stream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public static void fileDemo() throws IOException {
        /*Frame fr = new Frame("File Demo");
        fr.setBounds(10, 10, 300, 200);
        fr.setLayout(new BorderLayout());
        Panel p = new Panel(new GridLayout(1, 2));
        
        List list_C = new List();
        
        File fc = new File("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/file/");
        if(fc.exists()){
            System.out.println(" Dung thu muc");
        
            list_C.add(fc.getName());

            File driver_C = new File("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/file/");
            String[] dirs_C = driver_C.list();
            for (int i = 0; i < dirs_C.length; i++) {
                File f = new File("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/file/" + dirs_C[i]);
                if (f.isDirectory()) {
                    list_C.add("<DIR>" + dirs_C[i]);
                } else {
                    list_C.add(" "+f.getName());
                }
            }

            List list_D = new List();
            list_D.add("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/");
            File driver_D = new File("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/");
            String[] dirs_D = driver_D.list();
            for (int i = 0; i < dirs_D.length; i++) {
                File f = new File("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/" + dirs_D[i]);
                if (f.isDirectory()) {
                    list_D.add("<DIR>" + dirs_D[i]);
                } else {
                    list_D.add(" " + dirs_D[i]);
                }
            }
            p.add(list_C);
            p.add(list_D);
            fr.add(p, BorderLayout.CENTER);
            fr.setVisible(true);
        }else{
            System.out.println("Khong co thu muc");
            fc.mkdir();
        }
        */
        File f_D = new File("/Volumes/Data/works/java/edu/vn.hackademic.h17/vn.hackademic.h17jb3.stream/data/file/st//re  am$char.txt");
          System.out.println("path as:"+ f_D.getAbsolutePath());
          System.out.println("path name dir:"+ f_D.getCanonicalPath());
          System.out.println("path dir:"+ f_D.getParent());
          System.out.println("path space:"+ f_D.getTotalSpace());
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // TODO code application logic here
            System.out.println("bat dau");
            //readBytes();
            //writeDemo();
            //showFile();
            //copyFile();
            //rWData();
            //randomAccessDemo();
            //readChars();
            //readLines();
            //writeFileStreamChar();
            //readFileStreamChar();
            //writeObject();
            fileDemo();
            
            System.out.println("Ket thuc");
            
        //} catch (IOException ex) {
        } catch (Exception ex) {
            Logger.getLogger(VnHackademicH17jb3Stream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
