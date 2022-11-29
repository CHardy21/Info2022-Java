package com.chardy.springPacientes.entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class MedicalRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer heightCm;
	
	//private Double weight;
	
	private Integer Years;
	
	@ManyToMany
	private List<Disease> diseases;
}
