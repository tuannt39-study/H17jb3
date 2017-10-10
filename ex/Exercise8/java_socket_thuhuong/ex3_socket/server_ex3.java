package java_socket.ex3_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server_ex3 {

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
				int outAns = processData(inTxt);
				outputStream.writeUTF(String.valueOf(outAns));
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
		protected static int processData(String txt){
			int ans = -1;
			// convert data
			// get action
			char action = txt.charAt(0);
			// get position of second space
			int endSpace = txt.lastIndexOf(" ");
			// get 2 numbers 
			int num1 = Integer.parseInt(txt.substring(2, endSpace).trim());
			int num2 = Integer.parseInt(txt.substring(endSpace, txt.length()).trim());
			
			// invoke action
			if(action=='+') ans = num1+num2;
			else if(action=='-') ans = num1-num2;
			else if(action=='*') ans = num1*num2;
			else if(action=='/') ans = num1/num2;
			
			return ans;
			
			}
			
		public static void main(String[] args) throws IOException {
			chatServer();
		}


}
