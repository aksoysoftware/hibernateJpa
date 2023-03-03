package com.javaex.project.hibernateAndJpa.Entities;


import jakarta.persistence.*;
@Entity
@Table(name="actor")
public class Actor {
	@Id
	@Column(name="actor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String name;
	
	@Column(name="last_name")
	private String lastname;
	
	public Actor(int id, String name, String lastname) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}
	public Actor() {};

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
