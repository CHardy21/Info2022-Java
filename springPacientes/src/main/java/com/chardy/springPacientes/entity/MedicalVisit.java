package com.chardy.springPacientes.entity;

import java.io.Serializable;

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
	
	private Doctor doc;
	
	
	
	
}
