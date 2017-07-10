package edu.cesusc.curso;

import java.util.List;

import edu.cesusc.seguranca.util.DAOFactory;
import edu.cesusc.curso.Curso;
import edu.cesusc.curso.CursoDAO;

public class CursoRN {
	
	private CursoDAO cursoDAO;

		public CursoRN() {
			this.cursoDAO = DAOFactory.criarCursoDAO();
		}

		public Curso carregar(Integer codigo) {
			return this.cursoDAO.carregar(codigo);
		}

		public void salvar(Curso curso) {
			Integer codigo = curso.getId();
			if (codigo == null || codigo == 0) {
				this.cursoDAO.salvar(curso);
			} else {
				this.cursoDAO.exibir(curso);
			}
		}

		public void excluir(Curso servico) {
			this.cursoDAO.excluir(servico);
		}

		public List<Curso> listar() {
			return this.cursoDAO.listar();
		}

}
