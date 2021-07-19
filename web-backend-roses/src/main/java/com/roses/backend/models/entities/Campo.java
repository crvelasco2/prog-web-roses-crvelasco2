package com.roses.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="campos")
public class Campo extends Trabajador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_campo") 
	private Long idCampo;
	
	@Column(name="especialidad")
	private String Especialidad;
	
	
	public Campo() {
		super();
	}


	public Campo(long id) {
		super();
		this.idCampo = id;
	}


	public Long getIdCampo() {
		return idCampo;
	}


	public void setIdCampo(Long idCampo) {
		this.idCampo = idCampo;
	}


	public String getEspecialidad() {
		return Especialidad;
	}


	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	
	
	
}
