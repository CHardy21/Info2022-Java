package com.chardy.springPacientes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity(name="patients")
public class Patient implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// columnas de la tabla
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private Long id;
	
	/* @Column o @Column(...) entre los parentesis podemos definir por ejemplo (name = "user_name")
	 * que seria el nombre del campo en la DB... sino pongo nada
	*  toma por defecto el nombre de la variable.
	*  Tambien aqui irian las restricciones del campo por ejemplo max de 30 caracteres..(lenght=30).
	*/
	 
	@Column(length=30)	    	 
	private String name;		
	
	@Column(length=30)
	private String lastName;
	
	@Column(unique=false)
	private Integer dni;
	
	private Date birthDate;
	
	private Address address;
	
	@Column(name = "medical_visits")
	private MedicalVisit medicalVisits;
	
	
	//@Column(name = "medical_records")
	@OneToOne(
			mappedBy = "patients",
			cascade = { CascadeType.ALL},
			orphanRemoval = true,
			fetch = FetchType.LAZY
			)
	private MedicalRecord medicalRecords;
	
	@Column(name = "medical_assurance")
	private String medicalAssurance;

	
	//===================
	//    CONSTRUCTS
	//===================
	
	public Patient() {
		super();
	}

	public Patient(Long id, String name, String lastName, Integer dni, Date birthDate, Address address,
			MedicalVisit medicalVisits, MedicalRecord medicalRecords, String medicalAssurance) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.birthDate = birthDate;
		this.address = address;
		this.medicalVisits = medicalVisits;
		this.medicalRecords = medicalRecords;
		this.medicalAssurance = medicalAssurance;
	}

	//===================
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

	public MedicalVisit getMedicalVisits() {
		return medicalVisits;
	}

	public void setMedicalVisits(MedicalVisit medicalVisits) {
		this.medicalVisits = medicalVisits;
	}

	public MedicalRecord getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(MedicalRecord medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	public String getMedicalAssurance() {
		return medicalAssurance;
	}

	public void setMedicalAssurance(String medicalAssurance) {
		this.medicalAssurance = medicalAssurance;
	}


		

}
