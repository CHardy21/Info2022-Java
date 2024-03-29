package com.chardy.springPacientes.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="diseases")
public class Disease implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="diseases_id")
	private Long id;
	
	private String name;
	
	private String description;
	
	//@ManyToMany(mappedBy = "medical_records_id_diseases_id")
	//private List<MedicalRecord> medicalRecords;


	//----------------------------
	// CONSTRUCTORES DE LA CLASE
	//----------------------------
	
	public Disease() {
		super();
	}

	public Disease(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
