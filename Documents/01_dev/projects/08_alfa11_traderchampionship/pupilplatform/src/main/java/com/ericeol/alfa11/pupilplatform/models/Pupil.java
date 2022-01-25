package com.ericeol.alfa11.pupilplatform.models;

import java.util.List;

public class Pupil {

	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String avatar;
	
	private List<Role> roles;
	
	private List<Operation> operations;
	
	private Double dolarPoints;
	
	private Double b3Points;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public Double getDolarPoints() {
		return dolarPoints;
	}

	public void setDolarPoints(Double dolarPoints) {
		this.dolarPoints = dolarPoints;
	}

	public Double getB3Points() {
		return b3Points;
	}

	public void setB3Points(Double b3Points) {
		this.b3Points = b3Points;
	}
	
}
