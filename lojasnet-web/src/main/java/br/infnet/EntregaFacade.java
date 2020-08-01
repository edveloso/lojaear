package br.infnet;

import java.io.Serializable;
import java.util.List;

import ws.jboss.org.entregaapp.entrega.EntregaResponse;
import ws.jboss.org.entregaapp.entrega.EntregaServiceWs;
import ws.jboss.org.entregaapp.entrega.EntregaWs;

public class EntregaFacade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public List<EntregaResponse> listar(){
		EntregaServiceWs serv = new EntregaServiceWs();
		EntregaWs port = serv.getEntregaWsPort();
		List<EntregaResponse> lista = port.listar();
		return lista;
	}
	
	public EntregaResponse salvar(EntregaResponse entrega){
		EntregaServiceWs serv = new EntregaServiceWs();
		EntregaWs port = serv.getEntregaWsPort();
		EntregaResponse entregaResp = port.salvar(entrega);
		return entregaResp;
	}
	

}
