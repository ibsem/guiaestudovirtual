package edu.cesusc.anexo;

import java.util.List;

import org.hibernate.Session;



import edu.cesusc.anexo.Anexo;



public class AnexoDAOHibernate implements AnexoDAO {
	
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void inserir(Anexo anexo) {
		this.session.save(anexo);
		}

	public void salvar(Anexo anexo) {
		this.session.save(anexo);
	}
	@Override
	public void altera(Anexo anexo) {
		this.session.update(anexo);
		
	}

	@Override
	public void excluir(Anexo anexo) {
		this.session.delete(anexo);
		
	}
	public Anexo carregar(Integer id_anexo) {
		return (Anexo) this.session.get(Anexo.class, id_anexo);
	}

	@Override
	public List<Anexo> listar() {
		return this.session.createCriteria(Anexo.class).list();
	
	}

	@Override
	public void exibir(Anexo anexo) {
		// TODO Auto-generated method stub
		
	}
	
}
