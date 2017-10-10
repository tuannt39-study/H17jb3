package stream_IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex1_io {
	
	// create bai1.dat
	// write in 100 random numbers from 1-100
	private static void recordFile() throws IOException{
		// open a file
		FileOutputStream fout = new FileOutputStream("bai1.dat");
		DataOutputStream dataOut = new DataOutputStream(fout); //to write data to .dat file
		
		// start wwriting
		for(int i=0;i<100;i++){
			dataOut.writeInt((int)(Math.random()*100));
			//System.out.print("\n"+(int)(Math.random()*100));
		}
		// close stream
		fout.close();
		dataOut.close();
	}

	public static void main(String[] args) throws IOException {
		recordFile();
	}

}
