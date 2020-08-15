package com.example.demo.integration;

import com.example.demo.dto.Passenger;

public interface PassengerRestClient {
	public Passenger findPassengers(long id);
}
