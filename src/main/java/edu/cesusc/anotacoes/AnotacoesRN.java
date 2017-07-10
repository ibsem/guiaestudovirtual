package edu.cesusc.anotacoes;

import java.util.List;

import edu.cesusc.seguranca.util.DAOFactory;
import edu.cesusc.anotacoes.Anotacoes;
import edu.cesusc.anotacoes.AnotacoesDAO;

public class AnotacoesRN {
	
	private AnotacoesDAO anotacoesDAO;

		public AnotacoesRN() {
			this.anotacoesDAO = DAOFactory.criarAnotacoesDAO();
		}

		public Anotacoes carregar(Integer codigo) {
			return this.anotacoesDAO.carregar(codigo);
		}

		public void salvar(Anotacoes anotacoes) {
			Integer codigo = anotacoes.getId();
			if (codigo == null || codigo == 0) {
				this.anotacoesDAO.salvar(anotacoes);
			} else {
				this.anotacoesDAO.exibir(anotacoes);
			}
		}

		public void excluir(Anotacoes servico) {
			this.anotacoesDAO.excluir(servico);
		}

		public List<Anotacoes> listar() {
			return this.anotacoesDAO.listar();
		}

}
