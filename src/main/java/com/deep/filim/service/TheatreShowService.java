package com.deep.filim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.deep.filim.feign.AccountServiceProxy;
import com.deep.filim.model.TheatreScreenWrapper;
import com.deep.filim.model.TheatreShow;
import com.deep.filim.repository.TheatreShowRepo;

@Service
public class TheatreShowService {

	private AccountServiceProxy accountServiceProxy;
	
	private TheatreShowRepo theatreShowRepo;

	@Autowired
	public TheatreShowService(AccountServiceProxy accountServiceProxy,TheatreShowRepo theatreShowRepo) {
		this.accountServiceProxy = accountServiceProxy;
		this.theatreShowRepo=theatreShowRepo;
	}

	public ResponseEntity<List<TheatreScreenWrapper>> getAllScreens(Long id) {
		//return accountServiceProxy.getTheatreScreenss(id);
		return new ResponseEntity<List<TheatreScreenWrapper>>(accountServiceProxy.getTheatreScreenss(id),HttpStatus.OK);
	}

	public ResponseEntity<String> addNewShow(TheatreShow theatreShow) {  // need to add checking of overlapping screen date time before savingc
		
		 theatreShowRepo.saveAndFlush(theatreShow);
		 
		return new ResponseEntity<String>("Saved successfully with ID : "+theatreShow.getId(), HttpStatus.CREATED);
	}

}
