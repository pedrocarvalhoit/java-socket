package factorialServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class FactorialClient {

	public static void main(String[] args) {

		try {
			System.out.println("Cliente started");
			Socket soc = new Socket("localhost", 9806);
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number");
			int number = Integer.parseInt(userInput.readLine());
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(number);
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(in.readLine());
			soc.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
