package com.chardy.springPacientes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name= "users" )				// Nombre de la tabla de la DB sino toma el nombre de la clase en plural (usuarios pe.)

public class Paciente implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	
	// columnas de la tabla
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	@Column(name = "user_name")	    // aqui va el nombre del campo en la DB... sino pongo nada 
	private String nombre;			// toma por defecto el nombre de la variable (nombre en este caso).
	
	@Column(name = "user_lastname")
	private String apellido;
	@Column(name = "user_dni")
	private Integer dni;
	@Column(name = "user_address")
	private String direccion;
	@Column(name = "user_last_consulted")
	private Date ultimaConsulta;
	@Column(name = "user_birth")
	private Date fechaNacimiento;
	@Column(name = "user_height")
	private int alturaEnCm;
	@Column(name = "user_weight")
	private Double peso;
	@Column(name = "user_osmedical")
	private String obraSocial;
	
	// CONSTRUCTS
	
	public Paciente() {
		super();
	}

	public Paciente(Long id, String nombre, String apellido, Integer dni, String direccion, Date ultimaConsulta,
			Date fechaNacimiento, int alturaEnCm, Double peso, String obraSocial) {
		super();
		//this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.ultimaConsulta = ultimaConsulta;
		this.fechaNacimiento = fechaNacimiento;
		this.alturaEnCm = alturaEnCm;
		this.peso = peso;
		this.obraSocial = obraSocial;
	}
	
	// GETTERS Y SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getUltimaConsulta() {
		return ultimaConsulta;
	}

	public void setUltimaConsulta(Date ultimaConsulta) {
		this.ultimaConsulta = ultimaConsulta;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getAlturaEnCm() {
		return alturaEnCm;
	}

	public void setAlturaEnCm(int alturaEnCm) {
		this.alturaEnCm = alturaEnCm;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}
	

}
