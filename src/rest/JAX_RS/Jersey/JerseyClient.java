package rest.JAX_RS.Jersey;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class JerseyClient {

	public static void main(String[] args) {
		
		Client client = Client.create();
		
		WebResource resource = client.resource("http://localhost:8080/web_service/rest/class/getjson");
		
		ClientResponse response = resource.accept("application/json").get(ClientResponse.class);
	
		if(response.hasEntity()){
			String output = response.getEntity(String.class);
			System.out.println(output);
		}
	
	}

}
