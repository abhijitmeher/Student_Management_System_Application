package com.durgasoft.Student_Management_System.beans;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity	
@Table(name = "Students")
public class Student {

	@Id	
	@Column(name = "SID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	
	@Column(name = "NAME", length = 25)
	private String name;
	
	@Column(name = "EMAIL", length = 40)
	private String email;
	
	@Column(name = "MOBILE", length = 10)
	private Long mobile;
	
	@Column(name = "QUAL", length = 20)	
	private String qual;
	
	@OneToOne(cascade = CascadeType.ALL)	
	@JoinColumn(name = "ADDRESS_ID")	
	private Address address;
	
	public Student() {
		
	}
	
	public Student(Integer sid, String name, String email, Long mobile, String qual, Address address) {
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.qual = qual;
		this.address = address;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getQual() {
		return qual;	
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
