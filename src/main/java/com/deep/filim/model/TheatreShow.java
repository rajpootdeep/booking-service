package com.deep.filim.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TheatreShow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String show_name;
	private LocalDate show_date;
	private LocalTime start_time;
	private LocalTime end_time;
	private Long screen_id;
	public Long getId() {
		return id;
	}
	public String getShow_name() {
		return show_name;
	}
	public LocalDate getShow_date() {
		return show_date;
	}
	public LocalTime getStart_time() {
		return start_time;
	}
	public LocalTime getEnd_time() {
		return end_time;
	}
	public Long getScreen_id() {
		return screen_id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setShow_name(String show_name) {
		this.show_name = show_name;
	}
	public void setShow_date(LocalDate show_date) {
		this.show_date = show_date;
	}
	public void setStart_time(LocalTime start_time) {
		this.start_time = start_time;
	}
	public void setEnd_time(LocalTime end_time) {
		this.end_time = end_time;
	}
	public void setScreen_id(Long screen_id) {
		this.screen_id = screen_id;
	}
	
	
	
	
}
