package edu.cesusc.conteudo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Conteudo {
	
	@Id
	@GeneratedValue
	private Integer id;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	private Integer id_tipo_cont;
	private String nome;
	@org.hibernate.annotations.NaturalId
	
	/**
	 * @return the id_tipo_cont
	 */
	public Integer getId_tipo_cont() {
		return id_tipo_cont;
	}
	/**
	 * @param id_tipo_cont the id_tipo_cont to set
	 */
	public void setId_tipo_cont(Integer id_tipo_cont) {
		this.id_tipo_cont = id_tipo_cont;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	


	
	
	

}
