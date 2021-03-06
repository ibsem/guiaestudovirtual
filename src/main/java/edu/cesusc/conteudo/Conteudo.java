package edu.cesusc.conteudo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="conteudo")
public class Conteudo {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "id_materia")
	private Integer id_materia;
	@Column(name = "nome", updatable = false)
	private String nome;
	@org.hibernate.annotations.NaturalId
	
	@ManyToOne
	@JoinTable (name = "materia", joinColumns = { @JoinColumn( name = "id_materia",
		referencedColumnName = "id")})
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getId_materia() {
		return id_materia;
	}

	public void setId_tipo_cont(Integer id_materia) {
		this.id_materia = id_materia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	


	
	
	

}
