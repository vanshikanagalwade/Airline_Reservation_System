package com.entity;



import jakarta.persistence.CascadeType;
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
@Table(name = "passengers")
 public class Passenger {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
		@Column
	    private String firstname;
		@Column
	    private String lastname;
		@Column
		private int age;
		@Column
	    private String contact;
		
		@OneToMany(targetEntity=Reservation.class, cascade=CascadeType.ALL)
		@ManyToOne
		@JoinColumn(name = "reservation_id")
		private Reservation reservation;

		
		@Override
		public String toString() {
			return "Passsenger [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
					+ ", contact=" + contact + "]";
		}

		public Passenger() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Passenger(int id, String firstname, String lastname, int age, String contact) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
			this.contact = contact;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

}
