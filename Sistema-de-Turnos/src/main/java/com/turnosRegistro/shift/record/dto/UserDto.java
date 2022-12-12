package com.turnosRegistro.shift.record.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.turnosRegistro.shift.record.enums.Role;
import com.turnosRegistro.shift.record.model.Reserve;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Collection;

@Getter @Setter @ToString
@AllArgsConstructor
public class UserDto {
    private Long id;
    @NotBlank(message = "cant be null or empty")
    @Email(regexp = "^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message="Email format error")
    private String email;
    @Size(min = 8, message = "The password must be at least 8 characters")
    private String password;
    @Pattern(regexp = "^(?:(?:00)?549?)?0?(?:11|[2368]\\d)(?:(?=\\d{0,2}15)\\d{2})??\\d{8}$", message = "number no valid")
    private String phoneNumber;
    private String firstName;
    private String LastName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime creationDate;
    private Role role;
    private Collection<ReservePartDto> reserveFavorite;
	public UserDto() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	public UserDto(Long id,
			@NotBlank(message = "cant be null or empty") @Email(regexp = "^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message = "Email format error") String email,
			@Size(min = 8, message = "The password must be at least 8 characters") String password,
			@Pattern(regexp = "^(?:(?:00)?549?)?0?(?:11|[2368]\\d)(?:(?=\\d{0,2}15)\\d{2})??\\d{8}$", message = "number no valid") String phoneNumber,
			String firstName, String lastName, LocalDateTime creationDate, Role role,
			Collection<ReservePartDto> reserveFavorite) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		LastName = lastName;
		this.creationDate = creationDate;
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
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Collection<ReservePartDto> getReserveFavorite() {
		return reserveFavorite;
	}
	public void setReserveFavorite(Collection<ReservePartDto> reserveFavorite) {
		this.reserveFavorite = reserveFavorite;
	}
    
    
    
    
    
    
    
}
