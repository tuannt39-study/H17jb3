package java_socket.ex2_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server_ex2 {
	
	// get inputed data from client 
	// then process it and send to client
	protected static void chatServer() throws IOException{
		//initialize serverSocket
		ServerSocket serverSocket = new ServerSocket(9987);
		//initialize Socket
		Socket socket = serverSocket.accept();
		//initialize input and output stream
		DataInputStream inputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
		
		// get data from client
		while(true){
			String inTxt = inputStream.readUTF();
			System.out.println("Client said: "+inTxt);
			if(inTxt.equals("end")) break;
			//process inTxt
			String outTxt = processData(inTxt);
			outputStream.writeUTF(outTxt);
			outputStream.flush();
		}
		//close stream
		inputStream.close();
		outputStream.close();
		// close socket
		serverSocket.close();
		socket.close();
	}
	
	// process data from client
	protected static String processData(String txt){
		String ans;
		if(txt.equals("0")) ans = "khong";
		else if(txt.equals("1")) ans = "mot";
		else if(txt.equals("2")) ans = "hai";
		else if(txt.equals("3")) ans = "ba";
		else if(txt.equals("4")) ans = "bon";
		else if(txt.equals("5")) ans = "nam";
		else if(txt.equals("6")) ans = "sau";
		else if(txt.equals("7")) ans = "bay";
		else if(txt.equals("8")) ans = "tam";
		else if(txt.equals("9")) ans = "chin";
		else{
			ans = "khong phai so nguyen";
		}
		return ans;
		}
		
	public static void main(String[] args) throws IOException {
		chatServer();
	}

}
