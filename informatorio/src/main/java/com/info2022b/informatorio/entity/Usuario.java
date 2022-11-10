package com.info2022b.informatorio.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name= "users" )				// Nombre de la tabla de la DB sino toma el nombre de la clase en plural (usuarios pe.)

public class Usuario implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	
	// columnas de la tabla
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_name")	    // aqui va el nombre del campo en la DB... sino pongo nada 
									// toma por defecto el nombre de la variable (nombre en este caso).
	private String nombre;
	
	@Column(name = "user_lastname")
	private String apellido;
	
	@Column(name = "user_birth")
	private Date nacimiento;
	
	@Column(name = "user_dni")
	private Integer dni;
	
	@Column(name = "user_email")
	private String email;
	
	
	public Usuario() {}


	public Usuario(String nombre, String apellido, Date nacimiento, Integer dni, String email) {
		super();

		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.dni = dni;
		this.email = email;
	}

	
	// GETTERS Y SETTERS
	
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


	public Date getNacimiento() {
		return nacimiento;
	}


	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	

	
	


}
