package com.example.demo.modeldto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name ="autos_Sequence", sequenceName = "AUT_SEQ")
public class Auto {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "sequences")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "model")
	private int model;
	@Column(name = "trademark")
	private String trademark;
	@Column(name = "color")
	private String color;
	
	Auto(){}

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

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
