package edu.fatec.server;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Server {
	
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(4321,500);
		System.out.println("Server is up on port 1234");
		
		Socket client = server.accept();
		System.out.println("New connection with: "+client.getInetAddress().getHostAddress());
		
		Scanner scanner = new Scanner(client.getInputStream());
		while(scanner.hasNext())
			System.out.println(scanner.nextLine());
		
		scanner.close();
		server.close();
	}
}
