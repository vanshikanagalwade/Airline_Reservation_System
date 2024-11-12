package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Passenger;
import com.service.PassengerService;

import java.util.List;

	@RestController
	@RequestMapping("/passengers")
	public class PassengerController {
		
	    @Autowired
	    private PassengerService passengerService;

	    @GetMapping
	    public List<Passenger> getAllPassengers() {
	        return passengerService.getAllPassengers();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Passenger> getPassengerById(@PathVariable int id) {
	        Passenger passenger = passengerService.getPassengerById(id);
	        if (passenger != null) {
	            return ResponseEntity.ok(passenger);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PostMapping
	    public Passenger createPassenger(@RequestBody Passenger passenger) {
	        return passengerService.createPassenger(passenger);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Passenger> updatePassenger(@PathVariable int id, @RequestBody Passenger passenger) {
	        Passenger updatedPassenger = passengerService.updatePassenger(id, passenger);
	        if (updatedPassenger != null) {
	            return ResponseEntity.ok(updatedPassenger);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deletePassenger(@PathVariable int id) {
	        passengerService.deletePassenger(id);
	        return ResponseEntity.noContent().build();
	    }
	}

