package com.repository;


import com.entity.Passenger;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
	
}
