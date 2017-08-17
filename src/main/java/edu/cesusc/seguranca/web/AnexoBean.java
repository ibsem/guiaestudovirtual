package edu.cesusc.seguranca.web;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import edu.cesusc.conteudo.Conteudo;
import edu.cesusc.conteudo.ConteudoDAO;
import edu.cesusc.conteudo.ConteudoRN;



@ManagedBean(name = "conteudoBean")
@RequestScoped
public class AnexoBean {
	
	
private Conteudo conteudo = new Conteudo();
private List<Conteudo> lista;
private String destinoSalvar;

public String salvar() {
	ConteudoRN conteudoRN = new ConteudoRN();
	conteudoRN.salvar(this.conteudo);
	return this.destinoSalvar;
}

public String excluir() {
	ConteudoRN conteudoRN = new ConteudoRN();
	conteudoRN.excluir(this.conteudo);
	this.lista = null;
	return null;
	
}
public List<Conteudo> getLista() {
	if (this.lista == null) {
		ConteudoDAO conteudo = (ConteudoDAO) new Conteudo();
		this.lista = conteudo.listar();
	}
	return this.lista;
}
public Conteudo getConteudo() {
	return conteudo;
}

public void setConteudo(Conteudo conteudo) {
	this.conteudo = conteudo;
}


public String getDestinoSalvar() {
	return destinoSalvar;
}

public void setDestinoSalvar(String destinoSalvar) {
	this.destinoSalvar = destinoSalvar;
}


	
}
