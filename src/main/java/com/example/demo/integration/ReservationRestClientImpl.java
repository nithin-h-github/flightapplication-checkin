package com.example.demo.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Reservation;
import com.example.demo.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient{

	private static final String RESERVATION_REST_URL = "http://localhost:8080/flightapplication/reservations/";

	@Override
	public Reservation findReservation(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, request, Reservation.class);
		return reservation;
	}

}
