package com.example.demo.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Passenger;

@Component
public class PassengerRestClientImpl implements PassengerRestClient{
	
	private static final String RESERVATION_REST_URL = "http://localhost:8080/flightapplication/passengers/";

	@Override
	public Passenger findPassengers(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Passenger passenger = restTemplate.getForObject(RESERVATION_REST_URL+id, Passenger.class);
		return passenger;
	}

}
