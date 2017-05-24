package edu.cesusc.seguranca.util;
import edu.cesusc.seguranca.usuario.*;
import edu.cesusc.conteudo.ConteudoDAO;
import edu.cesusc.conteudo.ConteudoDAOHibernate;
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
}
