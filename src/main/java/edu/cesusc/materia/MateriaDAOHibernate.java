package edu.cesusc.materia;

import java.util.List;

import org.hibernate.Session;



import edu.cesusc.materia.Materia;



public class MateriaDAOHibernate implements MateriaDAO {
	
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void inserir(Materia materia) {
		this.session.save(materia);
		}

	public void salvar(Materia materia) {
		this.session.save(materia);
	}
	@Override
	public void altera(Materia materia) {
		this.session.update(materia);
		
	}

	@Override
	public void excluir(Materia materia) {
		this.session.delete(materia);
		
	}
	public Materia carregar(Integer id_materia) {
		return (Materia) this.session.get(Materia.class, id_materia);
	}

	@Override
	public List<Materia> listar() {
		return this.session.createCriteria(Materia.class).list();
	
	}

	@Override
	public void exibir(Materia Materia) {
		// TODO Auto-generated method stub
		
	}
	
}
