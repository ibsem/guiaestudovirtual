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
	public void setId_anotacoes(Integer id_anotacoes) {
		this.id_anotacoes = id_anotacoes;
	}
	public Integer getId_anexos() {
		return id_anexos;
	}
	public void setId_anexos(Integer id_anexos) {
		this.id_anexos = id_anexos;
	}
	public Integer getId_imagens() {
		return id_imagens;
	}
	public void setId_imagens(Integer id_imagens) {
		this.id_imagens = id_imagens;
	}
	public Integer getTexto() {
		return texto;
	}
	public void setTexto(Integer texto) {
		this.texto = texto;
	}
	public Integer getId_mapa() {
		return id_mapa;
	}
	public void setId_mapa(Integer id_mapa) {
		this.id_mapa = id_mapa;
	}
	public Integer getId_texto() {
		return id_texto;
	}
	public void setId_texto(Integer id_texto) {
		this.id_texto = id_texto;
	}
	public Integer getId_imagem() {
		return id_imagem;
	}
	public void setId_imagem(Integer id_imagem) {
		this.id_imagem = id_imagem;
	}
	public Integer getId_anexo() {
		return id_anexo;
	}
	public void setId_anexo(Integer id_anexo) {
		this.id_anexo = id_anexo;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public Integer getId() {
		return id;
	}

}
