package com.chardy.springPacientes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity	

public class Patient implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	
	// columnas de la tabla
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=30)	    	// (name = "user_name")aqui va el nombre del campo en la DB... sino pongo nada 
	private String name;		// toma por defecto el nombre de la variable (nombre en este caso).
	
	@Column(length=30)
	private String lastName;
	
	@Column(unique=false)
	
	private Integer dni;
	
	private Date birthDate;
	
	private Address address;
	
	@Column(name = "medical_visits")
	private MedicalVisits medicalVisits;
	
	@Column(name = "medical_reports")
	private MedicalRecord medicalRecord;
	
	@Column(name = "medical_assurance")
	private String medicalAssurance;
	
	// CONSTRUCTS
	
	public Patient() {
		super();
	}
	
	public Patient(Long id, String name, String lastName, Integer dni, Date birthDate, Address address,
			MedicalVisits medicalVisits, MedicalRecord medicalRecord, String medicalAssurance) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.birthDate = birthDate;
		this.address = address;
		this.medicalVisits = medicalVisits;
		this.medicalRecord = medicalRecord;
		this.medicalAssurance = medicalAssurance;
	}




	// GETTERS Y SETTERS
	//===================

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public MedicalVisits getMedicalVisits() {
		return medicalVisits;
	}

	public void setMedicalVisits(MedicalVisits medicalVisits) {
		this.medicalVisits = medicalVisits;
	}

	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public String getMedicalAssurance() {
		return medicalAssurance;
	}

	public void setMedicalAssurance(String medicalAssurance) {
		this.medicalAssurance = medicalAssurance;
	}

	


		

}
