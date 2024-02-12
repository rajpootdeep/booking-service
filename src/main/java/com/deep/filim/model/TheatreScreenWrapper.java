package com.deep.filim.model;

public class TheatreScreenWrapper {

	private Long id;

	private String name;

	private short seat_capacity;

	private String type;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public short getSeat_capacity() {
		return seat_capacity;
	}

	public String getType() {
		return type;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSeat_capacity(short seat_capacity) {
		this.seat_capacity = seat_capacity;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
