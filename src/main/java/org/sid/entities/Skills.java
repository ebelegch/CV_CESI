package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Skills implements Serializable {
	@Id@GeneratedValue
	private Long id;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	private String name;
	
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skills(String name) {
		super();
		this.name = name;
	}
}
