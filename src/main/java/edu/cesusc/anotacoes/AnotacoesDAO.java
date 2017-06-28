package edu.cesusc.anotacoes;

import java.util.List;

import edu.cesusc.anotacoes.Anotacoes;


public interface AnotacoesDAO {

	public void exibir(Anotacoes anotacoes);
	public void inserir(Anotacoes anotacoes);
	public void altera(Anotacoes anotacoes);
	public void salvar(Anotacoes anotacoes);
	public void excluir(Anotacoes anotacoes);	
	public Anotacoes carregar(Integer id_anotacoes);
	public List<Anotacoes> listar();
	
		
}
