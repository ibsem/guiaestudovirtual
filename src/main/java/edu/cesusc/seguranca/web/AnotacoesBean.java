package edu.cesusc.seguranca.web;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import edu.cesusc.anotacoes.Anotacoes;
import edu.cesusc.anotacoes.AnotacoesDAO;
import edu.cesusc.anotacoes.AnotacoesRN;



@ManagedBean(name = "anotacoesBean")
@RequestScoped
public class AnotacoesBean {
	
	
private Anotacoes anotacoes = new Anotacoes();
private List<Anotacoes> lista;
private String destinoSalvar;

public String salvar() {
	AnotacoesRN anotacoesRN = new AnotacoesRN();
	anotacoesRN.salvar(this.anotacoes);
	return this.destinoSalvar;
}

public String excluir() {
	AnotacoesRN anotacoesRN = new AnotacoesRN();
	anotacoesRN.excluir(this.anotacoes);
	this.lista = null;
	return null;
	
}
public List<Anotacoes> getLista() {
	if (this.lista == null) {
		AnotacoesDAO anotacoes = (AnotacoesDAO) new Anotacoes();
		this.lista = anotacoes.listar();
	}
	return this.lista;
}
public Anotacoes getAnotacoes() {
	return anotacoes;
}

public void setAnotacoes(Anotacoes anotacoes) {
	this.anotacoes = anotacoes;
}


public String getDestinoSalvar() {
	return destinoSalvar;
}

public void setDestinoSalvar(String destinoSalvar) {
	this.destinoSalvar = destinoSalvar;
}


	
}
