package com.deep.filim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deep.filim.model.TheatreShow;

@Repository
public interface TheatreShowRepo  extends JpaRepository<TheatreShow, Long>{

	
}
