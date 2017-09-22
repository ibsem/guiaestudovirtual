package edu.cesusc.seguranca.web;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import edu.cesusc.materia.Materia;
import edu.cesusc.materia.MateriaDAO;
import edu.cesusc.materia.MateriaRN;



@ManagedBean(name = "materiaBean")
@RequestScoped
public class MateriaBean {
	
	
private Materia materia = new Materia();
private List<Materia> lista;
private String destinoSalvar;

public String salvar() {
	MateriaRN materiaRN = new MateriaRN();
	materiaRN.salvar(this.materia);
	return this.destinoSalvar;
}

public String excluir() {
	MateriaRN materiaRN = new MateriaRN();
	materiaRN.excluir(this.materia);
	this.lista = null;
	return null;
	
}
public List<Materia> getLista() {
	if (this.lista == null) {
		MateriaDAO materia = (MateriaDAO) new Materia();
		this.lista = materia.listar();
	}
	return this.lista;
}
public Materia getMateria() {
	return materia;
}

public void setMateria(Materia materia) {
	this.materia = materia;
}


public String getDestinoSalvar() {
	return destinoSalvar;
}

public void setDestinoSalvar(String destinoSalvar) {
	this.destinoSalvar = destinoSalvar;
}


	
}
