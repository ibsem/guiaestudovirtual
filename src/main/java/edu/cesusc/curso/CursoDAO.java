package edu.cesusc.curso;

import java.util.List;

import edu.cesusc.curso.Curso;


public interface CursoDAO {

	public void exibir(Curso curso);
	public void inserir(Curso curso);
	public void altera(Curso curso);
	public void salvar(Curso curso);
	public void excluir(Curso curso);	
	public Curso carregar(Integer id);
	public List<Curso> listar();
	
		
}
