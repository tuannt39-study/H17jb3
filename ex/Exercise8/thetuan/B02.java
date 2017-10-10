package h17jb3.ex7.Streams;
//Viết chương trình đọc các dòng ký tự từ một file text và ghi mỗi dòng được mã hóa dạng UTF-8 vào file nhị phân. Hiển thị kích thước của file text và file nhị phân.

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class B02 {
	
	public void readFileByte(File file) throws IOException{
		int i;
		FileInputStream fin=null;
		try { 
			fin = new FileInputStream(file); 
		}
		catch(FileNotFoundException exc){
			System.out.println("Không thấy tệp - File Not Found");
		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("Dùng: Hiện tệp - Usage: ShowFile File"); return;
		}
		do {
			i = fin.read();
			if(i != -1) System.out.print((char) i);
		} while(i != -1); 
		fin.close();
	}
	
	public void copyFileByte(File source, FileOutputStream dest) throws IOException{
		FileInputStream fin = null; 
		DataOutputStream fout = null;
		int i;
		System.out.println("\nBắt đầu ghi");
		try { 
			// open input file
			try { 
				fin = new FileInputStream(source);
			}
			catch(FileNotFoundException exc) { 
				System.out.println("Không có tệp nguồn - Input File Not Found"); 
			}
			fout = new DataOutputStream(dest);
		} catch(ArrayIndexOutOfBoundsException exc) { 
			System.out.println("Dùng: sao chép - Usage: copyFileByte From To"); 
		}
		
		try {
			fout.writeUTF(fin.toString());
		} catch(IOException exc) { 
			System.out.println("Ghi lỗi - File Error"); 
		}
		fout.close();
		System.out.println("Ghi xong");
	}
	
	public static void main(String args[]) throws IOException { 
		File fileSource = new File("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai2.txt");
		FileOutputStream fileDest = new FileOutputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai2.dat");
		File fileDe = new File ("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai2.dat");
		
		B02 dt = new B02();
		dt.readFileByte(fileSource);
		dt.copyFileByte(fileSource, fileDest);
		System.out.println("file text source: " + fileSource.length() + " bytes" + "\nfile dat dest: " + fileDe.length() + " bytes");
	}
}
