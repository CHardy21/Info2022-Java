package com.chardy.springPacientes.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity(name="medical_record")  //?
public class MedicalRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="height_cm")
	private Integer heightCm;
	
	//private Double weight;
	
	private Integer Years;
	
	@ManyToMany(cascade = { CascadeType.ALL} )
	@JoinTable(
			name = "medical_record_id_disease_id",
			joinColumns = { @JoinColumn(name="medical_record_id")},
			inverseJoinColumns = { @JoinColumn(name="disease_id")}
			)
	private List<Disease> diseases;
}
