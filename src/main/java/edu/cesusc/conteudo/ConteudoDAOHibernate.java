package edu.cesusc.conteudo;

import java.util.List;

import org.hibernate.Session;



import edu.cesusc.conteudo.Conteudo;



public class ConteudoDAOHibernate implements ConteudoDAO {
	
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void inserir(Conteudo conteudo) {
		this.session.save(conteudo);
		}

	public void salvar(Conteudo conteudo) {
		this.session.save(conteudo);
	}
	@Override
	public void altera(Conteudo conteudo) {
		this.session.update(conteudo);
		
	}

	@Override
	public void excluir(Conteudo conteudo) {
		this.session.delete(conteudo);
		
	}
	public Conteudo carregar(Integer id_conteudo) {
		return (Conteudo) this.session.get(Conteudo.class, id_conteudo);
	}

	@Override
	public List<Conteudo> listar() {
		return this.session.createCriteria(Conteudo.class).list();
	
	}

	@Override
	public void exibir(Conteudo conteudo) {
		// TODO Auto-generated method stub
		
	}
	
}
