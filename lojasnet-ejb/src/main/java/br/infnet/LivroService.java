package br.infnet;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class LivroService implements ILivroService {

	@Inject
	private LivroDAO dao;
	
	@Override
	public Livro salvar(Livro livro) {
		return dao.salvar(livro);
	}
	
	@Override
	public List<Livro> listar(){
		return dao.listar();
	}
	
}
