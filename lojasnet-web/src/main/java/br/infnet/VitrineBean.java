package br.infnet;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import ws.jboss.org.entregaapp.entrega.EntregaResponse;

@Model
public class VitrineBean {

	@Inject
	private EntregaFacade facade;
	
	private List<EntregaResponse> entregas;

	public List<EntregaResponse> getEntregas() {
		return facade.listar();
	}

	public void setEntregas(List<EntregaResponse> entregas) {
		this.entregas = entregas;
	}
	
	
	
}
