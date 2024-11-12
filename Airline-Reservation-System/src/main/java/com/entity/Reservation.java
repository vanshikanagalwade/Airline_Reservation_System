package com.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservations")
	public class Reservation {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int reservationNumber;
		@Column
	    private String origin;
		@Column
	    private String destination;  
		@Column
	    private int price;
		
		//@OneToMany(targetEntity = Passenger.class, mappedBy = "reservation")
		//private List<Passenger> passengers;
		
		@OneToMany(mappedBy = "reservation")
		private List<Passenger> passengers;

	    @ManyToOne
	    @JoinColumn(name = "flight_id")
	    private Flight flight;

	    @ManyToOne
	    @JoinColumn(name = "passenger_id")
	    private Passenger passenger;

		@Override
		public String toString() {
			return "Reservation [reservationNumber=" + reservationNumber + ", origin=" + origin + ", destination="
					+ destination + ", price=" + price + ", flight=" + flight + ", passenger=" + passenger + "]";
		}
		
		

		public Reservation() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Reservation(int reservationNumber, String origin, String destination, int price, Flight flight,
				Passenger passenger) {
			super();
			this.reservationNumber = reservationNumber;
			this.origin = origin;
			this.destination = destination;
			this.price = price;
			this.flight = flight;
			this.passenger = passenger;
		}

		public int getReservationNumber() {
			return reservationNumber;
		}

		public void setReservationNumber(int reservationNumber) {
			this.reservationNumber = reservationNumber;
		}

		public String getOrigin() {
			return origin;
		}

		public void setOrigin(String origin) {
			this.origin = origin;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public Flight getFlight() {
			return flight;
		}

		public void setFlight(Flight flight) {
			this.flight = flight;
		}

		public Passenger getPassenger() {
			return passenger;
		}

		public void setPassenger(Passenger passenger) {
			this.passenger = passenger;
		}

		public void setId(int id) {
			// TODO Auto-generated method stub
			
		}
	    

}
