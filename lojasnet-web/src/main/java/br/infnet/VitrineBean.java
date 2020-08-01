package br.infnet;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import ws.jboss.org.entregaapp.entrega.EntregaResponse;

@Model
public class VitrineBean {

	@Inject
	private EntregaFacade facade;
	
	@Inject
	private ILivroService livroService;
	
	private Livro livro = new Livro();
	
	private List<Livro> livros;
	
	private Integer quantidade;
	
	private List<EntregaResponse> entregas;
	
	public VitrineBean() {
		
	}

	public String adicionarAoCarrinho() {
		//TODO persistir o estado no ejb de Carrinho
		System.out.println(livro);
		System.out.println(quantidade);
		return "/vitrine/carrinho";
	}
	
	public String formMostrar() {
		String id = RequestParamUtil.getRequestParameter("paramId");
		Livro livro = livroService.obterPeloId(Long.valueOf(id));
		this.setLivro(livro);
		return "/vitrine/produto";
	}
	
	
	public List<EntregaResponse> getEntregas() {
		return facade.listar();
	}

	public void setEntregas(List<EntregaResponse> entregas) {
		this.entregas = entregas;
	}

	public List<Livro> getLivros() {
		return livroService.listar();
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
