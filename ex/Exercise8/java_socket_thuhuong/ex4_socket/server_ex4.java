package java_socket.ex4_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class server_ex4 {
	
	// connect to client_ex4
	protected static void chatServer() throws IOException{
		//initialize serverSocket
		ServerSocket serverSocket = new ServerSocket(9000);
		//initialize Socket
		Socket socket = serverSocket.accept();
		//initialize input and output stream
		DataInputStream inputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
		
		
		while(true){
			// get data from client
			String inTxt = inputStream.readUTF();
			System.out.println("Client said: "+inTxt);
			if(inTxt.equals("end")) break;
			//process inTxt
			String outTxt = process(inTxt);
			// send feedback to client
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
	// process inputed data
	protected static String process(String txt){
		if(txt.equals("thoat")) return "tambiet";
		else if(txt.substring(0, 7).equals("nhonhat")){
			int n = Integer.parseInt(txt.substring(9, txt.length()));
			// create an array then sort then return the minimum number
			int[] arr = new int[n];
			Random rand = new Random();
			for(int i=0;i<n;i++){
				arr[i]=rand.nextInt(1000)+1;
			}
			Arrays.sort(arr);
 			return "ketqua:"+arr[0];
		}
		else
			return "sai dinh dang";
	}
	public static void main(String[] args) throws IOException {
		
		chatServer();
	}
}
