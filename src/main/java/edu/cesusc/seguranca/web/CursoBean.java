package edu.cesusc.seguranca.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import edu.cesusc.curso.Curso;
import edu.cesusc.curso.CursoDAO;
import edu.cesusc.curso.CursoRN;

@ManagedBean(name = "cursoBean")
@RequestScoped
public class CursoBean implements Serializable {

	private Curso curso = new Curso();
	private List<Curso> lista;
	private String destinoSalvar;
	private TreeNode arvoreCursos;

	public String salvar() {
		CursoRN cursoRN = new CursoRN();
		cursoRN.salvar(this.curso);
		return this.destinoSalvar;
	}

	public String excluir() {
		CursoRN cursoRN = new CursoRN();
		cursoRN.excluir(this.curso);
		this.lista = null;
		return null;

	}

	public List<Curso> getLista() {
		if (this.lista == null) {
			CursoDAO curso = (CursoDAO) new Curso();
			this.lista = curso.listar();
		}
		return this.lista;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}
	// Construtor do menu cursos Index

	@PostConstruct
	public void init() {
		arvoreCursos = new DefaultTreeNode("ArvoreCursos", null);
		TreeNode node0 = new DefaultTreeNode("Node 0", arvoreCursos);
		TreeNode node1 = new DefaultTreeNode("Node 1", arvoreCursos);

		TreeNode node00 = new DefaultTreeNode("Node 0.0", node0);
		TreeNode node01 = new DefaultTreeNode("Node 0.1", node0);

		TreeNode node10 = new DefaultTreeNode("Node 1.0", node1);

		node1.getChildren().add(new DefaultTreeNode("Node 1.1"));
		node00.getChildren().add(new DefaultTreeNode("Node 0.0.0"));
		node00.getChildren().add(new DefaultTreeNode("Node 0.0.1"));
		node01.getChildren().add(new DefaultTreeNode("Node 0.1.0"));
		node10.getChildren().add(new DefaultTreeNode("Node 1.0.0"));
		arvoreCursos.getChildren().add(new DefaultTreeNode("Node 2"));
	}

	public TreeNode getArvoreCursos() {
		return arvoreCursos;
	}

}
