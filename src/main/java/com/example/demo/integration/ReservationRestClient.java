package com.example.demo.integration;

import com.example.demo.dto.Reservation;
import com.example.demo.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request); 

}
