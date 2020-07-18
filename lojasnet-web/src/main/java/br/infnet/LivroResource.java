package br.infnet;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/livros")
public class LivroResource {

	@Inject
	private ILivroService service;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Livro> lista(){
		return service.listar();
	}
	
}
