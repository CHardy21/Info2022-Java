package com.chardy.springPacientes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="medical_visits")
public class MedicalVisit implements Serializable{

	private static final long serialVersionUID = 1L;

	// columnas de la tabla
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medical_visit_id")
	private Long id;
	
	@Column(name="medical_visit_date")
	private Date visitDate;

	
	// @ManyToOne
	// @JoinColumn(name="medical_visit_id")
	private Doctor doctors;
	 
	//----------------------------
	// CONSTRUCTORES DE LA CLASE
	//----------------------------
	
	public MedicalVisit() {
		super();
	}

	public MedicalVisit(Long id, Date visitDate, Doctor doctors) {
		super();
		this.id = id;
		this.visitDate = visitDate;
		this.doctors = doctors;
	}	
	
	//---------------------
	//  GETTERS y SETTERS
	//---------------------





	public Long getId() {
		return id;
	}

	public Doctor getDoctors() {
		return doctors;
	}

	public void setDoctors(Doctor doctors) {
		this.doctors = doctors;
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
