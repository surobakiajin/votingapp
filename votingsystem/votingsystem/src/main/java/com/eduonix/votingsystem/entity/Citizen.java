package com.eduonix.votingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citizens")
public class Citizen {
	
	@Id
	@Column(name="id")
	private Long id;

	public Long getId() {
		return id;
	}
	
	public Citizen() {
		super();
	}

	public Citizen(String name,Long id) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "citizen_name")
	private String name;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "has_voted")
	private Boolean hasVoted;

	public Boolean getHasVoted() {
		return hasVoted;
	}

	public void setHasVoted(Boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
	
	
}
