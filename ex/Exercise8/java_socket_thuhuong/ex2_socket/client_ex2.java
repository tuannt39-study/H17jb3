package java_socket.ex2_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client_ex2 {
	
	//input in a character from keyboard
	// then send to server
	protected static void chatClient() throws UnknownHostException, IOException{
		// open socket connected to 9987 server 
		Socket socket = new Socket("localhost",9987);
		// initialize input and output stream
		DataInputStream inputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
		
		// get character inputed from keyboard
		Scanner in = new Scanner(System.in);
		
		while(true){
			String inTxt = in.nextLine();
			// send data to server
			outputStream.writeUTF(inTxt);
			outputStream.flush();
			
			if(inTxt.equals("end")) break;
			
			// get processed data from server
			String outTxt = inputStream.readUTF();
			System.out.println("Server said: "+outTxt);
		}
		// close stream
		inputStream.close();
		outputStream.close();
		// close socket
		socket.close();
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		chatClient();
	}

}
