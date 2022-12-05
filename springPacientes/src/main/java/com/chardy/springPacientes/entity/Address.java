package com.chardy.springPacientes.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.UniqueConstraint;

@Entity(name="addresses")
public class Address implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany(cascade = { CascadeType.ALL} )
	@JoinTable(
			name = "addresses_id_streets_id",
			joinColumns = { @JoinColumn(name="address_id")},
			inverseJoinColumns = { @JoinColumn(name="street_id")},
			uniqueConstraints = {@UniqueConstraint(columnNames= {"address_id","street_id"})}
			)
	private Street street;
	
	@ManyToMany(cascade = { CascadeType.ALL} )
	@JoinTable(
			name = "addresses_id_numbers_id",
			joinColumns = { @JoinColumn(name="address_id")},
			inverseJoinColumns = { @JoinColumn(name="number_id")},
			uniqueConstraints = {@UniqueConstraint(columnNames= {"address_id","number_id"})}
			)
	private NumberStreet number;
	
	@ManyToMany(cascade = { CascadeType.ALL} )
	@JoinTable(
			name = "addresses_id_departements_id",
			joinColumns = { @JoinColumn(name="address_id")},
			inverseJoinColumns = { @JoinColumn(name="departament_id")},
			uniqueConstraints = {@UniqueConstraint(columnNames= {"address_id","departament_id"})}
			)
	private Departament departament;
	
	@ManyToMany(cascade = { CascadeType.ALL} )
	@JoinTable(
			name = "addresses_id_floors_id",
			joinColumns = { @JoinColumn(name="address_id")},
			inverseJoinColumns = { @JoinColumn(name="floor_id")},
			uniqueConstraints = {@UniqueConstraint(columnNames= {"address_id","floor_id"})}
			)
	private Floor floor;

	public Address() {
		super();
	}

	public Address(Long id, Street street, NumberStreet number, Departament departament, Floor floor) {
		super();
		this.id = id;
		this.street = street;
		this.number = number;
		this.departament = departament;
		this.floor = floor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	public NumberStreet getNumber() {
		return number;
	}

	public void setNumber(NumberStreet number) {
		this.number = number;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	
	
	
	
}
