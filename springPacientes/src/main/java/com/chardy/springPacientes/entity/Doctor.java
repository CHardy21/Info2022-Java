package com.chardy.springPacientes.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
			name = "doctor_id_specialitie_id",
			joinColumns = { @JoinColumn(name="doctor_id")},
			inverseJoinColumns = { @JoinColumn(name="specialitie_id")},
			uniqueConstraints = {@UniqueConstraint(columnNames= {"doctor_id","specialitie_id"})}
			)
	private List<Speciality> speciality;
	
	
	
	
}
