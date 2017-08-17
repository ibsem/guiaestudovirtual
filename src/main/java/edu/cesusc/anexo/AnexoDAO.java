package edu.cesusc.anexo;

import java.util.List;

import edu.cesusc.anexo.Anexo;


public interface AnexoDAO {

	public void exibir(Anexo anexo);
	public void inserir(Anexo anexo);
	public void altera(Anexo anexo);
	public void salvar(Anexo anexo);
	public void excluir(Anexo anexo);	
	public Anexo carregar(Integer id_anexo);
	public List<Anexo> listar();
	
		
}
