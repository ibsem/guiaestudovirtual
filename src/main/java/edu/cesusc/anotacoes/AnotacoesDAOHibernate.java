package edu.cesusc.anotacoes;

import java.util.List;

import org.hibernate.Session;



import edu.cesusc.anotacoes.Anotacoes;



public class AnotacoesDAOHibernate implements AnotacoesDAO {
	
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void inserir(Anotacoes anotacoes) {
		this.session.save(anotacoes);
		}

	public void salvar(Anotacoes anotacoes) {
		this.session.save(anotacoes);
	}
	@Override
	public void altera(Anotacoes anotacoes) {
		this.session.update(anotacoes);
		
	}

	@Override
	public void excluir(Anotacoes anotacoes) {
		this.session.delete(anotacoes);
		
	}
	public Anotacoes carregar(Integer id_anotacoes) {
		return (Anotacoes) this.session.get(Anotacoes.class, id_anotacoes);
	}

	@Override
	public List<Anotacoes> listar() {
		return this.session.createCriteria(Anotacoes.class).list();
	
	}

	@Override
	public void exibir(Anotacoes anotacoes) {
		// TODO Auto-generated method stub
		
	}
	
}
