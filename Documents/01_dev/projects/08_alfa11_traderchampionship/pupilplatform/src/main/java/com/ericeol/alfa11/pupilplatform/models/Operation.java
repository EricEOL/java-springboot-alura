package com.ericeol.alfa11.pupilplatform.models;

import java.time.LocalDateTime;

public class Operation {
	
	private Long id;
	
	private String stock;
	
	private Double points;
	
	private LocalDateTime createdAt = LocalDateTime.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Double getPoints() {
		return points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	public static void getTotalPointsInDolar(Long pupilId) {
		return;
	}
	
	public static void getTotalPointsInB3(Long pupilId) {
		return;
	}
}
