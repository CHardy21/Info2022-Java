package com.turnosRegistro.shift.record.dto;

import com.turnosRegistro.shift.record.enums.Day;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.HashSet;

@Getter @Setter @AllArgsConstructor
public class CompanyDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UserPartDto userCompany;
    private String name;
    @Pattern(regexp = "^(?:(?:00)?549?)?0?(?:11|[2368]\\d)(?:(?=\\d{0,2}15)\\d{2})??\\d{8}$", message = "number no valid")
    private String phoneNumber;
    private String description;
    @Email(regexp = "^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message="Email format error")
    private String email;
    @Size(max = 20, message = "The address can only have 20 characters")
    private String address;
    private String logoImage;
    @Size(min= 20, max = 20, message = "The cbu must have 20 characters")
    @Pattern(regexp = "[0-9]*", message = "the cbu only can include numbers")
    private String CBU;
    private Collection<TurnNotAvailableDto> turnNotAviables = new HashSet<>();
    private Collection<Day> daysOfWeekWeWork;
	
    
    public CompanyDto() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}


	public CompanyDto(Long id, UserPartDto userCompany, String name,
			@Pattern(regexp = "^(?:(?:00)?549?)?0?(?:11|[2368]\\d)(?:(?=\\d{0,2}15)\\d{2})??\\d{8}$", message = "number no valid") String phoneNumber,
			String description,
			@Email(regexp = "^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message = "Email format error") String email,
			@Size(max = 20, message = "The address can only have 20 characters") String address, String logoImage,
			@Size(min = 20, max = 20, message = "The cbu must have 20 characters") @Pattern(regexp = "[0-9]*", message = "the cbu only can include numbers") String cBU,
			Collection<TurnNotAvailableDto> turnNotAviables, Collection<Day> daysOfWeekWeWork) {
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
		this.turnNotAviables = turnNotAviables;
		this.daysOfWeekWeWork = daysOfWeekWeWork;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public UserPartDto getUserCompany() {
		return userCompany;
	}


	public void setUserCompany(UserPartDto userCompany) {
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


	public Collection<TurnNotAvailableDto> getTurnNotAviables() {
		return turnNotAviables;
	}


	public void setTurnNotAviables(Collection<TurnNotAvailableDto> turnNotAviables) {
		this.turnNotAviables = turnNotAviables;
	}


	public Collection<Day> getDaysOfWeekWeWork() {
		return daysOfWeekWeWork;
	}


	public void setDaysOfWeekWeWork(Collection<Day> daysOfWeekWeWork) {
		this.daysOfWeekWeWork = daysOfWeekWeWork;
	}
    
    
    
}
