package com.chardy.springPacientes.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="departaments")
public class Departament implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer departament;

	//----------------------------
	// CONSTRUCTORES DE LA CLASE
	//----------------------------
	
	public Departament() {
		super();
	}

	public Departament(Long id, Integer departament) {
		super();
		this.id = id;
		this.departament = departament;
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

	public Integer getDepartament() {
		return departament;
	}

	public void setDepartament(Integer departament) {
		this.departament = departament;
	}
	
	

}
