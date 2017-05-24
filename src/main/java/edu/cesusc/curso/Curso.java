package edu.cesusc.curso;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Curso {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private Float valor;
	private String duracao;
	private String responsavel;
	@org.hibernate.annotations.NaturalId
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	


	
	
	

}
