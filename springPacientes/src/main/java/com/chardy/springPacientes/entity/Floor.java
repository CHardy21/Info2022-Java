package com.chardy.springPacientes.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="floors")
public class Floor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer floor;

	//----------------------------
	// CONSTRUCTORES DE LA CLASE
	//----------------------------
	
	public Floor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Floor(Long id, Integer floor) {
		super();
		this.id = id;
		this.floor = floor;
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

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	
}
