package stream_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class ex3_io {
	
	// write int, current date, double into an output file
	private static void writeFile() throws IOException{
		OutputStream out = new FileOutputStream("bai3.txt");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		for(int i=1;i<=5;i++){
			oos.writeInt(i);
		}
		oos.writeDouble(5.5);
		oos.writeObject(new Date());
	}

	public static void main(String[] args) throws IOException {
		writeFile();
	}

}
