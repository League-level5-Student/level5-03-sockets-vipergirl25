package _02_Chat_Application;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import _00_Click_Chat.networking.Client;
import _00_Click_Chat.networking.Server;
import _01_Intro_To_Sockets.client.ClientGreeter;
import _01_Intro_To_Sockets.server.ServerGreeter;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp {
	ServerGreeter s;
	ClientGreeter c;
	
	public static void main(String[] args) {
		new ChatApp();
	}
	//use servergreeter if the answer is yes to hosting connection
	//use client greeter if answer is no
	public ChatApp() {
		int response = JOptionPane.showConfirmDialog(null, "would you like to host a connection?");
		if(response == JOptionPane.YES_OPTION) {
			s = new ServerGreeter();
			//setTitle("SERVER");
			JOptionPane.showMessageDialog(null, "Server started at " + );
		}
		
	}
//public ButtonClicker(){
//		
//		int response = JOptionPane.showConfirmDialog(null, "Would you like to host a connection?", "Buttons!", JOptionPane.YES_NO_OPTION);
//		if(response == JOptionPane.YES_OPTION){
//			server = new Server(8080);
//			setTitle("SERVER");
//			JOptionPane.showMessageDialog(null, "Server started at: " + server.getIPAddress() + "\nPort: " + server.getPort());
//			button.addActionListener((e)->{
//				server.sendClick();
//			});
//			add(button);
//			setVisible(true);
//			setSize(400, 300);
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			server.start();
//			
//		}else{
//			setTitle("CLIENT");
//			String ipStr = JOptionPane.showInputDialog("Enter the IP Address");
//			String prtStr = JOptionPane.showInputDialog("Enter the port number");
//			int port = Integer.parseInt(prtStr);
//			client = new Client(ipStr, port);
//			button.addActionListener((e)->{
//				client.sendClick();
//			});
//			add(button);
//			setVisible(true);
//			setSize(400, 300);
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			client.start();
//		}
//	}
}


}
