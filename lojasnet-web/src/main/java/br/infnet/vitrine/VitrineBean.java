package br.infnet.vitrine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.infnet.catalogo.ILivroService;
import br.infnet.catalogo.Livro;
import ws.jboss.org.alibanet.ecommerce.catalogo.EntregaResponse;

@Model
@SessionScoped
public class VitrineBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ILivroService service;
	
	@Inject
	private EntregaService entregaService;

	private List<Livro> livros;
	
	private Integer quantidade;

	private Livro livro;

	public VitrineBean() {
		livros = new ArrayList<Livro>();
		livro = new Livro();
	}
	
	
	public String pagar() {
		//TODO pagamento realizado com sucesso
		List<EntregaResponse> lista = entregaService.list();
		if(lista != null) {
			quantidade = lista.size();
		}
		return "/vitrine/entrega";
	}
	
	public String finalizar() {
		return "/vitrine/pagamento";
	}
	
	public String adicionarAoCarrinho() {
		System.out.println(livro);
		System.out.println(quantidade);
		return "/vitrine/carrinho";
	}
	
	public String formMostrar() {
		String id = getRequestParameter("paramId");
		Livro livro = service.obterPeloId(Long.valueOf(id));
		this.setLivro(livro);
		return "/vitrine/produto";
	}

	private String getRequestParameter(String parametro) {
		FacesContext context = FacesContext.getCurrentInstance();
		Map<String, String> map = context.getExternalContext().getRequestParameterMap();
		String id = map.get(parametro);
		return id;
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

	public ILivroService getService() {
		return service;
	}

	public void setService(ILivroService service) {
		this.service = service;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
