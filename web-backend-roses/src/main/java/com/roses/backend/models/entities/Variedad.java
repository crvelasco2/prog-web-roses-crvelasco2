package com.roses.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="variedades")
public class Variedad {
  
  //atributos 	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_variedad")
	private Integer idVariedad; //este atributo se mapea 
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="tamano_boton")
	private int TamanoBoton;
	
	@Column(name="dias_flores")
	private int diasfloreros ;
	
	@Column(name="numero_petalos")
	private int numeroPetalos;
	
	@Column(name="color_1")
	private String color1;
	
	@Column(name="color_2")
	private String color2;
	
	@Column(name="longitud_min")
	private int longitudMin;
	
	@Column(name="longitud_max")
	private int longitudMax;
	
	// costructor 
	
	public Variedad() {
		super();
	}
	
	public Variedad(int id) {
		super();
		this.idVariedad=id;
	}

	//get and set creat 
	
	public Integer getIdVariedad() {
		return idVariedad;
	}

	public void setIdVariedad(Integer idVariedad) {
		this.idVariedad = idVariedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamanoBoton() {
		return TamanoBoton;
	}

	public void setTamanoBoton(int tamanoBoton) {
		TamanoBoton = tamanoBoton;
	}

	public int getDiasfloreros() {
		return diasfloreros;
	}

	public void setDiasfloreros(int diasfloreros) {
		this.diasfloreros = diasfloreros;
	}

	public int getNumeroPetalos() {
		return numeroPetalos;
	}

	public void setNumeroPetalos(int numeroPetalos) {
		this.numeroPetalos = numeroPetalos;
	}

	public String getColor1() {
		return color1;
	}

	public void setColor1(String color1) {
		this.color1 = color1;
	}

	public String getColor2() {
		return color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
	}

	public int getLongitudMin() {
		return longitudMin;
	}

	public void setLongitudMin(int longitudMin) {
		this.longitudMin = longitudMin;
	}

	public int getLongitudMax() {
		return longitudMax;
	}

	public void setLongitudMax(int longitudMax) {
		this.longitudMax = longitudMax;
	}
	
}
