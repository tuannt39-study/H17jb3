package stream_IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ex2_io {
	
	// read from a file
	private static String read(String sourceFile) throws IOException{
		// create in stream obj
		InputStream is = new FileInputStream(sourceFile);
		// create array- 10 byte to read each time
		byte[] temp = new byte[10];
		int i =-1;
		
		//read byte from stream
		String str ="";
		while(is.read(temp)!=-1){
			str += new String(temp);
			System.out.print(str);
		}
		is.close();
		return str;
		
	}
	// write to a file
	private static void write(String str) throws IOException{
		// create out stream obj
		OutputStream os = new FileOutputStream("bai2_out.txt");
		// convert string to byte
		byte[] by = new byte[str.length()];
		for(int i=0;i<str.length();i++){
			by[i] = (byte) str.indexOf(i);
		}
		// write to stream
		os.write(by);
		// flush to file
		os.flush();
		// close stream
		os.close();
	}
	public static void main(String[] args) throws IOException {
		String sourceFile = "bai2.txt";
		read(sourceFile);
		write(read(sourceFile));
	}

}
