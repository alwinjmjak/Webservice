package rest.JAX_RS.Jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("class")
public class Server {
		
		@GET
		@Path("getstring")
		@Produces(MediaType.TEXT_PLAIN)
		public String returnString(){
			return "returning String";
		}
		
		@GET
		@Path("getxml")
		@Produces(MediaType.TEXT_XML)
		public String returnXML(){
			 return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  
		}
		
		@GET
		@Path("gethtml")
		@Produces(MediaType.TEXT_HTML)
		public String returnHTML(){
			 return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html>";  
		}
		
		@GET
		@Path("getjson")
		@Produces(MediaType.APPLICATION_JSON)
		public String returnJSON(){
			 return "{\"name\" : \"satya\"}";  
		}
}
