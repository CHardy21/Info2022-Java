package com.turnosRegistro.shift.record.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.HashSet;

@Data @Entity
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "UPDATE company SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")
public class Company {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userCompany;
    @Column(unique = true)
    private String name;
    @NotBlank(message = "can't be null")
    private String phoneNumber;
    @Column(nullable = false, length = 4000)
    private String description;
    @NotBlank(message = "can't be null")
    private String email;
    @NotBlank(message = "can't be null")
    private String address;
    @NotBlank(message = "can't be null")
    private String logoImage;
    private String CBU;
    private Boolean deleted = Boolean.FALSE;
    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company", cascade = CascadeType.ALL)
    private Collection<Turn> turn = new HashSet<>();
    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<TurnNotAvailable> turnNotAviables = new HashSet<>();
	
    
    public Company() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}


	public Company(Long id, User userCompany, String name, @NotBlank(message = "can't be null") String phoneNumber,
			String description, @NotBlank(message = "can't be null") String email,
			@NotBlank(message = "can't be null") String address, @NotBlank(message = "can't be null") String logoImage,
			String cBU, Boolean deleted, Collection<Turn> turn, Collection<TurnNotAvailable> turnNotAviables) {
		super();
		this.id = id;
		this.userCompany = userCompany;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.description = description;
		this.email = email;
		this.address = address;
		this.logoImage = logoImage;
		CBU = cBU;
		this.deleted = deleted;
		this.turn = turn;
		this.turnNotAviables = turnNotAviables;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public User getUserCompany() {
		return userCompany;
	}


	public void setUserCompany(User userCompany) {
		this.userCompany = userCompany;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getLogoImage() {
		return logoImage;
	}


	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}


	public String getCBU() {
		return CBU;
	}


	public void setCBU(String cBU) {
		CBU = cBU;
	}


	public Boolean getDeleted() {
		return deleted;
	}


	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}


	public Collection<Turn> getTurn() {
		return turn;
	}


	public void setTurn(Collection<Turn> turn) {
		this.turn = turn;
	}


	public Collection<TurnNotAvailable> getTurnNotAviables() {
		return turnNotAviables;
	}


	public void setTurnNotAviables(Collection<TurnNotAvailable> turnNotAviables) {
		this.turnNotAviables = turnNotAviables;
	}
    
    
    
    
    
}

