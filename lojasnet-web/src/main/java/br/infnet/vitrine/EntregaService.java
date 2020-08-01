package br.infnet.vitrine;

import java.io.Serializable;
import java.util.List;

import ws.jboss.org.alibanet.ecommerce.catalogo.EntregaResponse;
import ws.jboss.org.alibanet.ecommerce.catalogo.EntregaServiceWs;
import ws.jboss.org.alibanet.ecommerce.catalogo.EntregaWs;

public class EntregaService implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<EntregaResponse> list(){
	        EntregaServiceWs ws = new EntregaServiceWs();
	        EntregaWs wsPort = ws.getEntregaWsPort();
	        List<EntregaResponse> listar = wsPort.listar();
	        for (EntregaResponse response : listar) {
				System.out.println(response.getCliente());
			}
	        return listar;
	}

}
