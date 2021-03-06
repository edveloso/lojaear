package br.infnet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
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
	
	public String formAlterar() {
		String id = RequestParamUtil.getRequestParameter("paramId");
		Livro livro = service.obterPeloId(Long.valueOf(id));
		this.setLivro(livro);
		return "/livros/edit";
	}
	
	public String home() {
		return "/livros/home";
	}
	
	public String salvar() {
		service.salvar(livro);
		return "/livros/home";
	}
	
	public String newForm() {
		livro = new Livro();
		return "/livros/form";
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
