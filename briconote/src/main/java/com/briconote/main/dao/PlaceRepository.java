package com.briconote.main.dao;

import com.briconote.main.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlaceRepository extends JpaRepository<Place, Long> {
	
//	@Query("select p from Place p where addr = ?")
//	Place findByAddr(String address);
}
