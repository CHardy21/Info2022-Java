package com.chardy.springPacientes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="medical_visits")
public class MedicalVisit implements Serializable{

	private static final long serialVersionUID = 1L;

	// columnas de la tabla
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="visit_date")
	private Date visitDate;


	//----------------------------
	// CONSTRUCTORES DE LA CLASE
	//----------------------------
	
	public MedicalVisit() {
		super();
	}

	public MedicalVisit(Long id, Date visitDate) {
		super();
		this.id = id;
		this.visitDate = visitDate;
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

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	
	
}
