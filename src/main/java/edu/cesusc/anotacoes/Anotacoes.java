package edu.cesusc.anotacoes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "materia")
public class Anotacoes {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "id_anotacoes")
	private Integer id_anotacoes;
	@Column(name = "id_anexos")
	private Integer id_anexos;
	@Column(name = "id_imagens")
	private Integer id_imagens;
	@Column(name = "texto")
	private Integer texto;
	@Column(name = "id_mapa")
	private Integer id_mapa;
	@Column(name = "id_texto")
	private Integer id_texto;
	@Column(name = "id_imagem")
	private Integer id_imagem;
	@Column(name = "id_anexo")
	private Integer id_anexo;
	@Column(name = "id_usuario")
	private Integer id_usuario;
	@org.hibernate.annotations.NaturalId

	//@ManyToOne
	//@JoinTable(name = "anotacoes", joinColumns = { @JoinColumn(name = "id_anotacoes", referencedColumnName = "id") })
	//public Integer getId() {
	//	return id;
	//}

	public void setId(Integer id) {
		this.id= id;
	}

	public Integer getId_anotacoes() {
		return id_anotacoes;
	}

	public void setId_tipo_cont(Integer id_anexos) {
		this.id_curso = id_anexos;
	}

	public String gettexto() {
		return texto;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
