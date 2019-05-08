package Practica01;
import java.net.*;


public class ExempleMulticast {	
	//Servidor multicast
	MulticastSocket ms = new MulticastSocket();
	int puerto = 12345;
	
	InetAddress grupo = InetAddress.getByName("225.0.0.1");
	String msg = "Welcome";
	
	DatagramPacket pak = new DatagramPacket(msg.getBytes(), msg.length(),
			grupo, puerto);
	
	ms.send(pak);
	ms.close();
	
	//Cliente multicast
	MulticastSocket mst = new MulticastSocket(12345);
	InetAddress grup = InetAddress.getByName("255.0.0.1");
	
	ms.joinGroup(grup);
	byte[] buf = new byte[1000];
	DatagramPacket dp = new DatagramPacket(buf, buf.length);
	ms.receive(dp);
	ms.leaveGroup();
	ms.close();
}
