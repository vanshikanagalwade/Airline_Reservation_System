package com.repository;
	
import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	
}


