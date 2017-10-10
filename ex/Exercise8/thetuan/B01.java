package h17jb3.ex7.Streams;
//Viết chương trình tạo tập tin nhị phân có tên bai1.dat (tạo mới nếu tập tin chưa tồn tại). Ghi 100 số nguyên được tạo ngẫu nhiên vào tập tin trên.

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class B01 {

//	private static int genrateRandomNumber(int from, int to) {
//	    Random rd = new Random();
//	    int ramd = from + rd.nextInt(to - from + 1);
//	    return ramd;
//	}

	// - 1
//	public static void main(String[] args) throws IOException {
//		DataOutputStream dataOut;
//		DataInputStream dataIn;
//		int arrInt[] = new int[100];
//		try {
//			dataOut = new DataOutputStream(new FileOutputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai1.dat"));
//		} catch (IOException exc) {
//			System.out.println("Cannot open file.");
//			return;
//		}
//		try {
//			for (int j = 0; j < arrInt.length; j++) {
//				arrInt[j] = genrateRandomNumber(-100, 100);
//				dataOut.writeInt(arrInt[j]);
//			}
//			System.out.println("Writing arrInt");
//		} catch (IOException exc) {
//			System.out.println("Write error.");
//		}
//		dataOut.close();
//		System.out.println();
//		// Now, read them back.
//		try {
//			dataIn = new DataInputStream(new FileInputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai1.dat"));
//		} catch (IOException exc) {
//			System.out.println("Cannot open file.");
//			return;
//		}
//		try {
//			for (int j = 0; j < arrInt.length; j++) {
//				arrInt[j] = dataIn.readInt();
//				System.out.print(arrInt[j] + " ");
//			}
//		} catch (IOException exc) {
//			System.out.println("Read error.");
//		}
//		dataIn.close();
//	}

	// - 2
//	public static void main(String[] args) throws IOException {
//		DataOutputStream dataOut;
//		DataInputStream dataIn;
//		int arrInt[] = new int[100];
//		try {
//			dataOut = new DataOutputStream(
//					new FileOutputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai1.dat"));
//		} catch (IOException exc) {
//			System.out.println("Cannot open file.");
//			return;
//		}
//		try {
//			Random rd = new Random();
//			for (int j = 0; j < arrInt.length; j++) {
//				arrInt[j] = rd.nextInt(100);
//				dataOut.writeInt(arrInt[j]);
//			}
//			System.out.println("Writing arrInt");
//		} catch (IOException exc) {
//			System.out.println("Write error.");
//		}
//		dataOut.close();
//		System.out.println();
//		// Now, read them back.
//		try {
//			dataIn = new DataInputStream(
//					new FileInputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai1.dat"));
//		} catch (IOException exc) {
//			System.out.println("Cannot open file.");
//			return;
//		}
//		try {
//			for (int j = 0; j < arrInt.length; j++) {
//				arrInt[j] = dataIn.readInt();
//				System.out.print(arrInt[j] + " ");
//			}
//		} catch (IOException exc) {
//			System.out.println("Read error.");
//		}
//		dataIn.close();
//	}

	// - 3
	public void writeArrByte (int arrInt[], File file) throws IOException {
		DataOutputStream dataOut = null;
		try {
			dataOut = new DataOutputStream( new FileOutputStream(file));
		} catch (IOException exc) {
			System.out.println("Không mở được tệp - Cannot open file.");
		}
		try {
			for (int j = 0; j < arrInt.length; j++) {
				dataOut.writeInt(arrInt[j]);
			}
			System.out.println("Ghi mảng - Writing arrInt");
		} catch (IOException exc) {
			System.out.println("Ghi lỗi -  Write error.");
		}
		dataOut.close();
		System.out.println();
	}
	
	public void readArrByte (int arrInt[], File file) throws IOException {
		DataInputStream dataIn = null;
		try {
			dataIn = new DataInputStream( new FileInputStream(file));
		} catch (IOException exc) {
			System.out.println("Không mở được tệp - Cannot open file.");
		}
		try {
			for (int j = 0; j < arrInt.length; j++) {
				arrInt[j] = dataIn.readInt();
				System.out.print(arrInt[j] + " ");
			}
		} catch (IOException exc) {
			System.out.println("Đọc lỗi - Read error.");
		}
		dataIn.close();
	}
	
	public static void main(String[] args) throws IOException {
		int arrInt[] = new int[100];
		Random rd = new Random();
		for (int j = 0; j < arrInt.length; j++) {
			arrInt[j] = rd.nextInt(100);
		}
		File file = new File("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai1.dat");
		B01 dt = new B01();
		dt.writeArrByte(arrInt, file);
		dt.readArrByte(arrInt, file);
	}
}