package edu.cesusc.curso;

import java.util.List;

import org.hibernate.Session;



import edu.cesusc.conteudo.Curso;



public class CursoDAOHibernate implements CursoDAO {
	
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void inserir(Curso conteudo) {
		this.session.save(conteudo);
		}

	public void salvar(Curso conteudo) {
		this.session.save(conteudo);
	}
	@Override
	public void altera(Curso conteudo) {
		this.session.update(conteudo);
		
	}

	@Override
	public void excluir(Curso conteudo) {
		this.session.delete(conteudo);
		
	}
	public Curso carregar(Integer id_conteudo) {
		return (Curso) this.session.get(Curso.class, id_conteudo);
	}

	@Override
	public List<Curso> listar() {
		return this.session.createCriteria(Curso.class).list();
	
	}

	@Override
	public void exibir(Curso Conteudo) {
		// TODO Auto-generated method stub
		
	}
	
}
