package edu.cesusc.seguranca.web;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import edu.cesusc.curso.Curso;
import edu.cesusc.curso.CursoDAO;
import edu.cesusc.curso.CursoRN;



@ManagedBean(name = "cursoBean")
@RequestScoped
public class CursoBean {
	
	
private Curso curso = new Curso();
private List<Curso> lista;
private String destinoSalvar;

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


	
}
