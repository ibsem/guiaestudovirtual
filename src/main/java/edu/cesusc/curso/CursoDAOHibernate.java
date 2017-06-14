package edu.cesusc.curso;

import java.util.List;
import org.hibernate.*;

public class CursoDAOHibernate implements CursoDAO {
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(Curso curso) {
		this.session.save(curso);
	}

	public void atualizar(Curso curso) {
		Curso cursoPermissao = this.carregar(curso.getId());
		this.session.evict(cursoPermissao);

	}

	public void excluir(Curso curso) {
		this.session.delete(curso);
	}

	public Curso carregar(Integer codigo) {
		return (Curso) this.session.get(Curso.class, codigo);
	}

	public List<Curso> listar() {
		return this.session.createCriteria(Curso.class).list();
	}

	public Curso buscarPorLogin(String login) {
		String hql = "select u from Curso u where u.login = :login";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("login", login);
		return (Curso) consulta.uniqueResult();
	}

	@Override
	public void exibir(Curso curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inserir(Curso curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public void altera(Curso curso) {
		// TODO Auto-generated method stub

	}
}
