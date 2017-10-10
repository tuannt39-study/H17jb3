package java_socket.ex1_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server_ex1 {
	
	//connect to client_ex1
	protected static void chatServer() throws IOException{
		//initialize new ServerSocket
		ServerSocket serverSocket = new ServerSocket(9989);
		// initialize new Socket
		Socket socket = serverSocket.accept();
		// initialize input and output stream
		DataInputStream inputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
		
		// get text from keyboard
		Scanner in = new Scanner(System.in);
		while(true){
			// get messages from client
			String str1 = inputStream.readUTF();
			System.out.println("Client said: "+str1);
			
			if(str1.equals("bye")) break;
			
			// send text to client
			String str2 = in.nextLine();
			outputStream.writeUTF(str1);
			outputStream.flush();
		}
		// close stream
		inputStream.close();
		outputStream.close();
		// close socket
		socket.close();
		serverSocket.close();
	}
	
	public static void main(String[] args) throws IOException {
		chatServer();
	}

}
