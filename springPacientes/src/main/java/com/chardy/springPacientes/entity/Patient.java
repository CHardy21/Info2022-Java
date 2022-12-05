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
	
	//private Address address;
	
	@Column(name = "medical_visits")
	private MedicalVisit medicalVisits;
	
	
	@Column(name = "medical_records")
	@OneToOne(
			mappedBy = "patient",
			cascade = { CascadeType.ALL},
			orphanRemoval = true,
			fetch = FetchType.LAZY
			)
	private MedicalRecord medicalRecords;
	
	//@Column(name = "medical_assurance")
	//private String medicalAssurance;
	
	// CONSTRUCTS
	
	public Patient() {
		super();
	}


	// GETTERS Y SETTERS
	//===================




		

}
