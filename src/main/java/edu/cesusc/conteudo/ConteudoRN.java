package edu.cesusc.conteudo;

import java.util.List;

import edu.cesusc.seguranca.util.DAOFactory;
import edu.cesusc.conteudo.Conteudo;
import edu.cesusc.conteudo.ConteudoDAO;

public class ConteudoRN {
	
	private ConteudoDAO conteudoDAO;

		public ConteudoRN() {
			this.conteudoDAO = DAOFactory.criarConteudoDAO();
		}

		public Conteudo carregar(Integer codigo) {
			return this.conteudoDAO.carregar(codigo);
		}

		public void salvar(Conteudo conteudo) {
			Integer codigo = conteudo.getId();
			if (codigo == null || codigo == 0) {
				this.conteudoDAO.salvar(conteudo);
			} else {
				this.conteudoDAO.exibir(conteudo);
			}
		}

		public void excluir(Conteudo servico) {
			this.conteudoDAO.excluir(servico);
		}

		public List<Conteudo> listar() {
			return this.conteudoDAO.listar();
		}

}
