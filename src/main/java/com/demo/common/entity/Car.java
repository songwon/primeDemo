package com.demo.common.entity;

import java.time.LocalDate;

public class Car implements IdEntity {

	private Long id;
	private String name;
	private Number price;
	private LocalDate date;

	public Car() {

	}

	public Car(Long id, String name, Number price, LocalDate date) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.date = date;
	}


	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Number getPrice() {
		return price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Number price) {
		this.price = price;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

}