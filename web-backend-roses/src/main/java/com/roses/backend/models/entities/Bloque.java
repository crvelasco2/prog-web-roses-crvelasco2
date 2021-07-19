package com.roses.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bloques")
public class Bloque {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_bloque") 
	private Integer idBloque;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="numero_camas")
	private short numeroCamas;
	
	@JoinColumn(name = "id_invernadero", referencedColumnName = "id_invernadero")
	@ManyToOne
	private Invernadero invernadero;
	

	public Bloque(Integer idBloque) {
		super();
		this.idBloque = idBloque;
	}

	public Bloque() {
		super();
	}

	public Integer getIdBloque() {
		return idBloque;
	}

	public void setIdBloque(Integer idBloque) {
		this.idBloque = idBloque;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public short getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(short numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
	
	

}
