package LAB4;

import java.io.*;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.elements.exception.ConnectorException;

public class Client1 {

	public static void main(String[] args) {
		CoapClient client1=new CoapClient("coap://localhost/Humidity");
		try {
			for(int i=0;i<10;i++) {
				String text=client1.get().getResponseText();
				System.out.println(text);
			}
		}catch(ConnectorException e2) {
				e2.printStackTrace();
			}
			catch(IOException e2) {
				e2.printStackTrace();
			}//Blocking Call
			System.out.println("Client Ended");
		}
	}

