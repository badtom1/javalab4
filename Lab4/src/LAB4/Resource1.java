package LAB4;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class Resource1 extends CoapResource{
	public Resource1(String name) {
		super(name);
	}
	
	@Override
	public void handleGET(CoapExchange exchange) {
		String text="Humidy : "+Math.floor((Math.random()*(45-20)+20));
		//System.out.println("Host Requesting : "+exchange.getSourceAddress()+" "+text);
		
		exchange.respond(text);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		CoapServer server=new CoapServer();
		server.add(new Resource1("Humidity"));
		server.start();
	}
}
