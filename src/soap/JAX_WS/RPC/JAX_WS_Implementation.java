package soap.JAX_WS.RPC;

import javax.jws.WebService;

/**
 * Implementing the webservice interface and providing the end point interface i.e the location of the interface
 * 
 * @author ALWINSHOBANRAJM
 *
 */
@WebService(endpointInterface = "soap.JAX_WS.RPC.JAX_WS_Interface")
public class JAX_WS_Implementation implements JAX_WS_Interface{

	@Override
	public String getJAXWSwebMethod(String name) {
		// TODO Auto-generated method stub
		return "Executed the API function " + name;
	}

}
