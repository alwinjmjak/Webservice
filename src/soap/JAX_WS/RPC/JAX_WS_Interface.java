package soap.JAX_WS.RPC;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Declaring the interface as the webservice and mentioning the style for the SOAP webservice
 * 
 * Here it is a RPC style
 * 
 * @author ALWINSHOBANRAJM
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface JAX_WS_Interface {
	
	/*
	 * Interface with a web method
	 */
	@WebMethod
	public String getJAXWSwebMethod(String name);

}
