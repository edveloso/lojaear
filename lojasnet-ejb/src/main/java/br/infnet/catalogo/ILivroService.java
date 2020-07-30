package br.infnet.catalogo;

import java.util.List;

public interface ILivroService {

	Livro salvar(Livro livro);

	List<Livro> listar();

	Livro obterPeloId(Long valueOf);

}