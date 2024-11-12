package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Reservation;

public interface ReservationRepository  extends JpaRepository<Reservation, Integer> {
	
}
