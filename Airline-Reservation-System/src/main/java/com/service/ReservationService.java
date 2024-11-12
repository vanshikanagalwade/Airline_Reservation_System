package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Reservation;
import com.repository.ReservationRepository;

import java.util.List;

	@Service
	public class ReservationService {
	    @Autowired
	    private ReservationRepository reservationRepository;

	    public List<Reservation> getAllReservations() {
	        return reservationRepository.findAll();
	    }

	    public Reservation getReservationById(int id) {
	        return reservationRepository.findById(id).orElse(null);
	    }

	    public Reservation createReservation(Reservation reservation) {
	        return reservationRepository.save(reservation);
	    }

	    @SuppressWarnings("rawtypes")
		public Reservation updateReservation(int id, Reservation reservation) {
	        reservation.setId(id);
	        return reservationRepository.save(reservation);
	    }

	    public void deleteReservation(int id) {
	        reservationRepository.deleteById(id);
	    }
	}

