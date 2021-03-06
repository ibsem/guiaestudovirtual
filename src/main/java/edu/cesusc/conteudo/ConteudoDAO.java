package edu.cesusc.conteudo;

import java.util.List;

import edu.cesusc.conteudo.Conteudo;


public interface ConteudoDAO {

	public void exibir(Conteudo conteudo);
	public void inserir(Conteudo conteudo);
	public void altera(Conteudo conteudo);
	public void salvar(Conteudo conteudo);
	public void excluir(Conteudo conteudo);	
	public Conteudo carregar(Integer id_conteudo);
	public List<Conteudo> listar();
	
		
}
