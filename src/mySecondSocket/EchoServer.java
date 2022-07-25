package mySecondSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		
		try {
			System.out.println("Waiting for clientes...");
			ServerSocket ss = new ServerSocket(9806);
			Socket soc = ss.accept();
			System.out.println("Connection stablished");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream() ));
			String str = in.readLine();
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println("Server says: " + str);
			ss.close();			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
