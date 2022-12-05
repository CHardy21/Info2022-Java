package com.chardy.springPacientes.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="specialities")
public class Speciality  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	
	//----------------------------
	// CONSTRUCTORES DE LA CLASE
	//----------------------------
	
	public Speciality() {
		super();
	}

	public Speciality(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	//---------------------
	//  GETTERS y SETTERS
	//---------------------
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
