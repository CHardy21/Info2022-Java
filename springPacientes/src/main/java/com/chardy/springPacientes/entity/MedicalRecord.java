package com.chardy.springPacientes.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;


@Entity(name="medical_records")  //?
public class MedicalRecord implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medical_records_id")
	private Long id;
	
	@Column(name="height_cm")
	private Integer heightCm;
	
	//private Double weight;
	
	private Integer Years;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private Patient patients;
	
	@ManyToMany(cascade = { CascadeType.ALL} )
	@JoinTable(
			name = "medical_records_id_diseases_id",
			joinColumns = { @JoinColumn(name="medical_record_id")},
			inverseJoinColumns = { @JoinColumn(name="disease_id")}
			//uniqueConstraints = {@UniqueConstraint(columnNames= {"medical_records_id","diseases_id"})}
			)
	
	private List<Disease> diseases;

	//----------------------------
	// Constructores de la clase
	//----------------------------
	
	public MedicalRecord() {
		super();
	}

	public MedicalRecord(Long id, Integer heightCm, Integer years, List<Disease> diseases) {
		super();
		this.id = id;
		this.heightCm = heightCm;
		Years = years;
		this.diseases = diseases;
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


	public Integer getHeightCm() {
		return heightCm;
	}


	public void setHeightCm(Integer heightCm) {
		this.heightCm = heightCm;
	}


	public Integer getYears() {
		return Years;
	}


	public void setYears(Integer years) {
		Years = years;
	}


	public List<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}
	
}
