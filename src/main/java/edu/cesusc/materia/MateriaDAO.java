package edu.cesusc.materia;

import java.util.List;

import edu.cesusc.materia.Materia;

public interface MateriaDAO {

	public void exibir(Materia materia);

	public void inserir(Materia materia);

	public void altera(Materia materia);

	public void salvar(Materia materia);

	public void excluir(Materia materia);

	public Materia carregar(Integer id_materia);

	public List<Materia> listar();

}
