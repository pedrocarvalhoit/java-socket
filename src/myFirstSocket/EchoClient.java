package myFirstSocket;

import java.io.IOException;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) {

		try {
			Socket soc = new Socket("localhost", 9806);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
