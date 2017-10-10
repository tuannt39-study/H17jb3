package Ex1;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Bai1 {
	static String FILE_PATH = "D:\\bai1.txt";
	static String B_FILE_PATH = "D:\\bai2.txt";

	public static void main(String[] args) {
		Write();
		ReadAndBinaryWrite();
		BaiIII();
		System.out.println("Success");
	}

	private static void Write() {
		FileOutputStream fos = null;

		File f = new File(FILE_PATH);
		try {
			fos = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Random rd = new Random();
		for (int i = 0; i < 100; i++) {
			try {
				fos.write(rd.nextInt(10000));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void ReadAndBinaryWrite() {
		int i;

		File fi = new File(FILE_PATH);
		File fo = new File(B_FILE_PATH);

		FileInputStream fis = null;
		DataOutputStream fos = null;

		try {
			fis = new FileInputStream(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			fos = new DataOutputStream(new FileOutputStream(fo));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			do {
				i = fis.read();
				if (i != -1) {
					fos.writeInt(i);
				}
			} while (i != -1);
		} catch (Exception e) {
			System.err.println("loi r");
		}
		System.out.println(fi.getUsableSpace());
		System.out.println(fo.getUsableSpace());

	}

	private static void BaiIII() {
		BufferedWriter bw= null;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		File file = new File("D:\\bai3.txt");

		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {	
			bw.write(1);
			bw.write(2);
			bw.write(3);
			bw.write(4);
			bw.write(5);
			bw.write(sdf.format(cal));
			bw.write("5.5");
		} catch (Exception e) {

		}
	}

}
