package com.chardy.springPacientes.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

@Entity(name="doctors")
public class Doctor implements Serializable{

	private static final long serialVersionUID = 1L;

	// columnas de la tabla
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String lastName;
	
	@ManyToMany(cascade = { CascadeType.ALL} )
	@JoinTable(
			name = "doctors_id_specialities_id",
			joinColumns = { @JoinColumn(name="doctor_id")},
			inverseJoinColumns = { @JoinColumn(name="specialitie_id")},
			uniqueConstraints = {@UniqueConstraint(columnNames= {"doctor_id","specialitie_id"})}
			)
	private List<Speciality> speciality;
	
	@OneToMany(
			mappedBy = "doctors",
			cascade = { CascadeType.ALL},
			orphanRemoval = true,
			fetch = FetchType.LAZY
			)
	private List<MedicalVisit> medicalVisits;
	

	
	//----------------------------
	// CONSTRUCTORES DE LA CLASE
	//----------------------------
	
	public Doctor() {
		super();
	}

	public Doctor(Long id, String name, String lastName, List<Speciality> speciality,List<MedicalVisit> medicalVisits) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.speciality = speciality;
		this.medicalVisits = medicalVisits;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Speciality> getSpeciality() {
		return speciality;
	}

	public void setSpeciality(List<Speciality> speciality) {
		this.speciality = speciality;
	}

	public List<MedicalVisit> getMedicalVisits() {
		return medicalVisits;
	}

	public void setMedicalVisits(List<MedicalVisit> medicalVisits) {
		this.medicalVisits = medicalVisits;
	}
	

	
	
}
