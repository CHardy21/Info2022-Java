package com.turnosRegistro.shift.record.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.turnosRegistro.shift.record.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity @Data
@AllArgsConstructor @NoArgsConstructor
@SQLDelete(sql = "UPDATE user SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "can´t be empty or null")
    @Column(unique = true)
    private String email;
    @NotBlank(message = "can´t be empty or null")
    private String password;
    @NotBlank(message = "can´t be empty or null")
    private String phoneNumber;
    @NotBlank(message = "can´t be empty or null")
    private String firstName;
    private String LastName;
    @CreationTimestamp
    private LocalDateTime creationDate;
    private Boolean deleted = Boolean.FALSE;
    private Role role = Role.CLIENT;
    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Collection<Reserve> reserveFavorite;
	
    
    public User() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}


	public User(Long id, @NotBlank(message = "can´t be empty or null") String email,
			@NotBlank(message = "can´t be empty or null") String password,
			@NotBlank(message = "can´t be empty or null") String phoneNumber,
			@NotBlank(message = "can´t be empty or null") String firstName, String lastName, LocalDateTime creationDate,
			Boolean deleted, Role role, Collection<Reserve> reserveFavorite) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		LastName = lastName;
		this.creationDate = creationDate;
		this.deleted = deleted;
		this.role = role;
		this.reserveFavorite = reserveFavorite;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public LocalDateTime getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}


	public Boolean getDeleted() {
		return deleted;
	}


	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public Collection<Reserve> getReserveFavorite() {
		return reserveFavorite;
	}


	public void setReserveFavorite(Collection<Reserve> reserveFavorite) {
		this.reserveFavorite = reserveFavorite;
	}
    
    
    
    
}
