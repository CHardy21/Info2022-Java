package com.info2022b.informatorio.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Usuario implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	
	// columnas de la tabla
	

	private Long id;
	private String nombre;
	private String apellido;
	private Date nacimiento;
	private Integer dni;
	private String email;
	
	
	public Usuario() {}


	public Usuario(Long id, String nombre, String apellido, Date nacimiento, Integer dni, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.dni = dni;
		this.email = email;
	}
	
	


}
