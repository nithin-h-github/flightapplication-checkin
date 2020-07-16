package com.example.demo.dto;

public class Reservation {

	private Boolean checkedIn;
	
	private int numberOfBags;
	
	private long passenger;
	
	private long flightid;

	private long id;
	
	public Boolean getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public long getPassenger() {
		return passenger;
	}

	public void setPassenger(long passenger) {
		this.passenger = passenger;
	}

	public long getFlightid() {
		return flightid;
	}

	public void setFlightid(long flightid) {
		this.flightid = flightid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
