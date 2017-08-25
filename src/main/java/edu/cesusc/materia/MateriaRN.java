package edu.cesusc.materia;

import java.util.List;

import edu.cesusc.seguranca.util.DAOFactory;
import edu.cesusc.materia.Materia;
import edu.cesusc.materia.MateriaDAO;

public class MateriaRN {

	private MateriaDAO materiaDAO;

	public MateriaRN() {
		this.materiaDAO = DAOFactory.criarMateriaDAO();
	}

	public Materia carregar(Integer codigo) {
		return this.materiaDAO.carregar(codigo);
	}

	public void salvar(Materia materia) {
		Integer codigo = materia.getId();
		if (codigo == null || codigo == 0) {
			this.materiaDAO.salvar(materia);
		} else {
			this.materiaDAO.exibir(materia);
		}
	}

	public void excluir(Materia servico) {
		this.materiaDAO.excluir(servico);
	}

	public List<Materia> listar() {
		return this.materiaDAO.listar();
	}

}
