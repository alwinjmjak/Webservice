package soap.JAX_WS.DOCUMENT;

import javax.xml.ws.Endpoint;

/**
 * this publishes the WSDL document for the API function in the JAX_WS_Implementation class
 * @author ALWINSHOBANRAJM
 *
 */
public class Publisher {

	public static void main(String[] args) {
		
		/**
		 * This URL will be hosted and WSDL document will be available in "http://localhost:9999/webservice/soap/jaxws/?wsdl"
		 */
		Endpoint.publish("http://localhost:9999/webservice/soap/jaxws", new JAX_WS_Implementation());

	}

}
