package com.deep.filim.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deep.filim.model.TheatreScreenWrapper;
import com.deep.filim.model.TheatreShow;
import com.deep.filim.service.TheatreShowService;

@RestController
@RequestMapping("/theatreshow")
public class TheatreShowController {
	
	private TheatreShowService theatreShowService;
	
	
	public TheatreShowController(TheatreShowService theatreShowService) {
		this.theatreShowService=theatreShowService;
	}
	
	
	
	@GetMapping("/getscreens/{id}")
	public ResponseEntity<List<TheatreScreenWrapper>> getAllScreens(@PathVariable Long id){
		return theatreShowService.getAllScreens(id);
	}
	
	@PostMapping("/addshow")
	public ResponseEntity<String> addNewShow(@RequestBody TheatreShow theatreShow){
		return theatreShowService.addNewShow(theatreShow);
	}
	
	
} 
