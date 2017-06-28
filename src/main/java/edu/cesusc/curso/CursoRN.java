package edu.cesusc.curso;

import java.util.List;

import edu.cesusc.seguranca.util.DAOFactory;
import edu.cesusc.curso.Conteudo;
import edu.cesusc.curso.ConteudoDAO;

public class CursoRN {
	
	private MateriaDAO cursoDAO;

		public ConteudoRN() {
			this.cursoDAO = DAOFactory.criarConteudoDAO();
		}

		public Conteudo carregar(Integer codigo) {
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

		public void excluir(Conteudo servico) {
			this.cursoDAO.excluir(servico);
		}

		public List<Conteudo> listar() {
			return this.cursoDAO.listar();
		}

}
