package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name = "flights")
	public class Flight {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    @Column
	    private String flightNumber;
	    @Column
	    private String destination;
	    @Column
	    private String source;
	    @Column
	    private String departureTime;
	    
	    
		@Override
		public String toString() {
			return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", destination=" + destination + ", source="
					+ source + ", departureTime=" + departureTime + "]";
		}


		public Flight() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Flight(int id, String flightNumber, String destination, String source, String departureTime) {
			super();
			this.id = id;
			this.flightNumber = flightNumber;
			this.destination = destination;
			this.source = source;
			this.departureTime = departureTime;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFlightNumber() {
			return flightNumber;
		}


		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}


		public String getDestination() {
			return destination;
		}


		public void setDestination(String destination) {
			this.destination = destination;
		}


		public String getSource() {
			return source;
		}


		public void setSource(String source) {
			this.source = source;
		}


		public String getDepartureTime() {
			return departureTime;
		}


		public void setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
		}
	    
	    


}
