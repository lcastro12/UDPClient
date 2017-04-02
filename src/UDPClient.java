import java.io.*;
import java.net.*;
import java.util.Date;

class UDPClient {
	
	public static int PORT;
	public static int objects=10;
	public static void sendObjects(int n, InetAddress IPAddress, DatagramSocket clientSocket) throws IOException{
		for (int i = 0; i < n; i++) {
			Object o = new Object(i, new Date());
			ByteArrayOutputStream bs = new ByteArrayOutputStream();
			ObjectOutputStream os = new ObjectOutputStream(bs);
			os.writeObject(o);
			os.close();
			byte[] sendData = bs.toByteArray();
			DatagramPacket dp = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);
			clientSocket.send(dp);
		}
	}
	public static void setObjects(int i){
		objects=i;
	}
	public static void main(String args[]) throws Exception
	{
		DatagramSocket clientSocket = new DatagramSocket();
		InetAddress IPAddress = InetAddress.getByName("192.168.0.12");
		byte[] receiveData = new byte[1024];
		sendObjects(objects, IPAddress, clientSocket);
		
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		clientSocket.receive(receivePacket);
		//response debe contener: número de objetos recibidos, numero de objetos faltantes, tiempo promedio de envió de objetos
		String response = new String(receivePacket.getData());
		System.out.println("FROM SERVER:" + response);
		
			
		
		clientSocket.close();
	}
}