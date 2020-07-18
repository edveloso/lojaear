package br.infnet;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Local
public class LivroDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Livro salvar(Livro livro) {
		em.merge(livro);
		return livro;
	}
	
	public List<Livro> listar(){
		return em.createQuery("from Livro l", Livro.class).getResultList();
	}

	public Livro obterPeloId(Long id) {
		return em.find(Livro.class, id);
	}
	
	

}
