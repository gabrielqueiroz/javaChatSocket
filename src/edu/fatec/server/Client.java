package edu.fatec.server;
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("127.0.0.1",4321);
		System.out.println("Client is connected to the server");
		
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(client.getOutputStream());
		
		while(input.hasNextLine())
			output.println(input.nextLine());
		
		output.close();
		input.close();
		client.close(); 
	}
	
}
