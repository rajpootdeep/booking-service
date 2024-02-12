package com.deep.filim.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.deep.filim.model.TheatreScreenWrapper;

//@FeignClient(name = "account-service", url = "localhost:8081")
@FeignClient(name = "account-service")
public interface AccountServiceProxy {

	
	@GetMapping("theatre/getscreens/{id}")
	public List<TheatreScreenWrapper> getTheatreScreenss(@PathVariable Long id);
	//ResponseEntity<
	
}
