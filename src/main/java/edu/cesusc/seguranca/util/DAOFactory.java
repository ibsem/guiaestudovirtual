package edu.cesusc.seguranca.util;
import edu.cesusc.anotacoes.AnotacoesDAO;
import edu.cesusc.conteudo.ConteudoDAO;
import edu.cesusc.conteudo.ConteudoDAOHibernate;
import edu.cesusc.curso.CursoDAO;
import edu.cesusc.seguranca.usuario.UsuarioDAO;
import edu.cesusc.seguranca.usuario.UsuarioDAOHibernate;
import edu.cesusc.anexo.AnexoDAO;
import edu.cesusc.anexo.AnexoDAOHibernate;;
public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO; 
	}
	public static ConteudoDAO criarConteudoDAO() {
		ConteudoDAOHibernate conteudoDAO = new ConteudoDAOHibernate();
		conteudoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return conteudoDAO; 
	}
	public static AnotacoesDAO criarAnotacoesDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	public static CursoDAO criarCursoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	public static AnexoDAO criarAnexoDAO() {
		AnexoDAOHibernate anexoDAO = new AnexoDAOHibernate();
		anexoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return anexoDAO; 
	}
}
