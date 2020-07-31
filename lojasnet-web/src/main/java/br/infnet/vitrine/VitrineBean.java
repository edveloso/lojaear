package br.infnet.vitrine;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.infnet.catalogo.ILivroService;
import br.infnet.catalogo.Livro;

@Model
public class VitrineBean {

	@Inject
	private ILivroService service;

	private List<Livro> livros;

	private Livro livro;

	public VitrineBean() {
		livros = new ArrayList<Livro>();
		livro = new Livro();
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
