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
	
	private Livro livro;
	
	public LivroBean() {
		livros = new ArrayList<Livro>();
		livro = new Livro();
	}
	
	public String home() {
		return "home";
	}
	
	public String salvar() {
		service.salvar(livro);
		return "home";
	}
	
	public String newForm() {
		livro = new Livro();
		return "form";
	}

	public List<Livro> getLivros() {
		return service.listar();
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	
}
