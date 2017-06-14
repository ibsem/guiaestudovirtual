package edu.cesusc.anexo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="anexo")
public class Anexo {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "id_conteudo")
	private Integer id_conteudo;
	@Column(name = "nome", updatable = false)
	private String nome;
	@org.hibernate.annotations.NaturalId
	
	@ManyToOne
	@JoinTable (name = "conteudo", joinColumns = { @JoinColumn( name = "id_conteudo",
		referencedColumnName = "id")})
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getId_curso() {
		return id_conteudo;
	}

	public void setId_tipo_cont(Integer id_materia) {
		this.id_conteudo = id_materia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	


	
	
	

}
