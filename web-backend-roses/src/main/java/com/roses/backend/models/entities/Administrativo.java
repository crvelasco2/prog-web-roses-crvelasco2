package com.roses.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="administrativos")
public class Administrativo extends Trabajador {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_administrativo") 
	private Long idAdministrativo;
	
	@Column(name="rol")
	private String rol;
	
	

	public Administrativo() {
		super();
	}


	public Administrativo(Long idAdministrativo) {
		super();
		this.idAdministrativo = idAdministrativo;
	}


	public Long getIdAdministrativo() {
		return idAdministrativo;
	}


	public void setIdAdministrativo(Long idAdministrativo) {
		this.idAdministrativo = idAdministrativo;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}

