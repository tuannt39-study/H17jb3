package h17jb3.ex7.Streams;
//Viết chương trình ghi một mảng 5 số nguyên là 1, 2, 3, 4, 5, một đối tượng Date chứa thời gian hiện tại và một số thực 5.5 vào tập tin bai3.dat.

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class B03 {
	
	public void writeFileByte(File file) throws IOException{
		DataOutputStream dataOut;
		int[] a = {1, 2, 3, 4, 5};
		double c = 5.5;
		try {
			dataOut = new DataOutputStream( new FileOutputStream(file));
		} catch (IOException exc) {
			System.out.println("Không mở được tệp - Cannot open file.");
			return;
		}
		try {
			System.out.print("Array: ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
				dataOut.writeInt(a[i]);
			}
			System.out.println("\nWriting: " + c);
			dataOut.writeDouble(c);
		} catch (IOException exc) {
			System.out.println("Ghi lỗi -  Write error.");
		}
		long b = file.lastModified();
		System.out.printf("%s %tc", "Date :", b);
		dataOut.close();
	}
	
	public static void main(String args[]) throws IOException {
		File file = new File("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai3.dat");
		B03 dt = new B03();
		dt.writeFileByte(file);
	}

}
