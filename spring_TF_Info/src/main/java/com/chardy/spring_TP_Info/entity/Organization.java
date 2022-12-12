package com.chardy.spring_TP_Info.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;

@Entity(name="organizations")
public class Organization implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//@ManyToOne
    //@Column(name = "user_id")
    //private User userOrganization;
	
	@Column(name="org_name", length =30, unique = true)
	private String name;
	
	@Column(name="org_cuit", length= 11)
	private Long cuit;
	
	@Column(name="org_address")
	private String address;
	
	@Column(name="org_phone", nullable = false)
	private Long phone;
	
	@Column(name="org_email")
	private String email;
	
	@Column(name="org_create_at")
	private Date createAt;
	
	@Column(name="org_token")
	private String token;
	
	
	
}
