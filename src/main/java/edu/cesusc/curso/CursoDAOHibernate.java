package edu.cesusc.curso;

import java.util.List;

import org.hibernate.Session;



import edu.cesusc.curso.Curso;



public class CursoDAOHibernate implements CursoDAO {
	
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void inserir(Curso curso) {
		this.session.save(curso);
		}

	public void salvar(Curso curso) {
		this.session.save(curso);
	}
	@Override
	public void altera(Curso curso) {
		this.session.update(curso);
		
	}

	@Override
	public void excluir(Curso curso) {
		this.session.delete(curso);
		
	}
	public Curso carregar(Integer id_curso) {
		return (Curso) this.session.get(Curso.class, id_curso);
	}

	@Override
	public List<Curso> listar() {
		return this.session.createCriteria(Curso.class).list();
	
	}

	@Override
	public void exibir(Curso Curso) {
		// TODO Auto-generated method stub
		
	}
	
}
