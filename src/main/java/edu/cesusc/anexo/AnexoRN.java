package edu.cesusc.anexo;

import java.util.List;

import edu.cesusc.seguranca.util.DAOFactory;
import edu.cesusc.anexo.Anexo;
import edu.cesusc.anexo.AnexoDAO;

public class AnexoRN {
	
	private AnexoDAO anexoDAO;

		public AnexoRN() {
			this.anexoDAO = DAOFactory.criarAnexoDAO();
		}

		public Anexo carregar(Integer codigo) {
			return this.anexoDAO.carregar(codigo);
		}

		public void salvar(Anexo anexo) {
			Integer codigo = anexo.getId();
			if (codigo == null || codigo == 0) {
				this.anexoDAO.salvar(anexo);
			} else {
				this.anexoDAO.exibir(anexo);
			}
		}

		public void excluir(Anexo servico) {
			this.anexoDAO.excluir(servico);
		}

		public List<Anexo> listar() {
			return this.anexoDAO.listar();
		}

}
