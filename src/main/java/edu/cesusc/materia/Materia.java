package edu.cesusc.materia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name="materia")
public class Materia {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "id_curso")
	private Integer id_curso;
	@Column(name = "nome", updatable = false)
	private String nome;
	@org.hibernate.annotations.NaturalId
	
	@ManyToOne
	@JoinTable (name = "curso", joinColumns = { @JoinColumn( name = "id_curso",
		referencedColumnName = "id")})
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getId_curso() {
		return id_curso;
	}

	public void setId_tipo_cont(Integer id_materia) {
		this.id_curso = id_materia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	


	
	
	

}
