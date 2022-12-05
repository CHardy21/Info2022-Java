package com.chardy.springPacientes.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="numbers_streets")
public class NumberStreet implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer number;

	//----------------------------
	// CONSTRUCTORES DE LA CLASE
	//----------------------------
	
	public NumberStreet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NumberStreet(Long id, Integer number) {
		super();
		this.id = id;
		this.number = number;
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	

}
