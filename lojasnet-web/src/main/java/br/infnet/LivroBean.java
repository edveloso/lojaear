package br.infnet;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class LivroBean {
	
	@Inject
	private ILivroService service;

	private List<Livro> livros;
	
	public LivroBean() {
		livros = new ArrayList<Livro>();
	}

	public List<Livro> getLivros() {
		return service.listar();
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	
	
}
