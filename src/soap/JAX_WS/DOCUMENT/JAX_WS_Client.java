package soap.JAX_WS.DOCUMENT;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class JAX_WS_Client {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://localhost:9999/webservice/soap/jaxws?wsdl");
		
		QName qName = new QName("http://DOCUMENT.JAX_WS.soap/", "JAX_WS_ImplementationService");
		
		Service service = Service.create(url, qName);
		
		JAX_WS_Interface jaxwsinterface = service.getPort(JAX_WS_Interface.class);
		
		System.out.println(jaxwsinterface.getJAXWSwebMethod("Mr.Alwin"));
	}

}
