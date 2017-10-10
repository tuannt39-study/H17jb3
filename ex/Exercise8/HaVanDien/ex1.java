/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex7;
import java.io.*;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class ex1 {
    public void writeArrByte (int arrInt[], File file) throws IOException {
		DataOutputStream dataOut = null;
		try {
			dataOut = new DataOutputStream( new FileOutputStream(file));
		} catch (IOException exc) {
			System.out.println("Cannot open file.");
		}
		try {
			for (int j = 0; j < arrInt.length; j++) {
				dataOut.writeInt(arrInt[j]);
			}
			System.out.println("Ghi mang");
		} catch (IOException exc) {
			System.out.println("Ghi loi");
		}
		dataOut.close();
		System.out.println();
	}
	
	public void readArrByte (int arrInt[], File file) throws IOException {
		DataInputStream dataIn = null;
		try {
			dataIn = new DataInputStream( new FileInputStream(file));
		} catch (IOException exc) {
			System.out.println(" Cannot open file.");
		}
		try {
			for (int j = 0; j < arrInt.length; j++) {
				arrInt[j] = dataIn.readInt();
				System.out.print(arrInt[j] + " ");
			}
		} catch (IOException exc) {
			System.out.println(" Read error.");
		}
		dataIn.close();
	}
	
	public static void main(String[] args) throws IOException {
		int arrInt[] = new int[100];
		Random rd = new Random();
		for (int j = 0; j < arrInt.length; j++) {
			arrInt[j] = rd.nextInt(100);
		}
		File file = new File("/bai1.dat");
		ex1 dt = new ex1();
		dt.writeArrByte(arrInt, file);
		dt.readArrByte(arrInt, file);
	}
    
}
