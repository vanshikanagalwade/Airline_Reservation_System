package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Flight;
import com.repository.FlightRepository;

import java.util.List;

	@Service
	public class FlightService {
	    @Autowired
	    private FlightRepository flightRepository;

	    public List<Flight> getAllFlights() {
	        return flightRepository.findAll();
	    }

	    public Flight getFlightById(Integer id) {
	        return flightRepository.findById(id).orElse(null);
	    }

	    public Flight createFlight(Flight flight) {
	        return flightRepository.save(flight);
	    }

	    public Flight updateFlight(int id, Flight flight) {
	        flight.setId(id);
	        return flightRepository.save(flight);
	    }

	    public void deleteFlight(Integer id) {
	        flightRepository.deleteById(id);
	    }
	}


