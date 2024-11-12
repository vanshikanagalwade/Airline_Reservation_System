package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Passenger;
import com.repository.PassengerRepository;

import java.util.List;

	@Service
	public class PassengerService {
	    @Autowired
	    private PassengerRepository passengerRepository;

	    public List<Passenger> getAllPassengers() {
	        return passengerRepository.findAll();
	    }

	    public Passenger getPassengerById(int id) {
	        return passengerRepository.findById(id).orElse(null);
	    }

	    public Passenger createPassenger(Passenger passenger) {
	        return passengerRepository.save(passenger);
	    }

	    public Passenger updatePassenger(int id, Passenger passenger) {
	        passenger.setId(id);
	        return passengerRepository.save(passenger);
	    }

	    public void deletePassenger(int id) {
	        passengerRepository.deleteById(id);
	    }
	}


