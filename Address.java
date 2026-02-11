package com.durgasoft.Student_Management_System.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address") 
public class Address {	
	
	@Id	
	@Column(name = "ID")		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "CITY", length = 20)
	private String city;
	
	@Column(name = "STATE" , length = 20)
	private String state;
	
	@Column(name = "PINCODE", length = 6)
	private Long pincode;
	
	public Address() {	
		
	}
	
	public Address(Integer id, String city, String state, Long pincode) {
		this.id = id;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

}
