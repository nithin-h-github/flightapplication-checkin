package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.Passenger;
import com.example.demo.dto.Reservation;
import com.example.demo.dto.ReservationUpdateRequest;
import com.example.demo.integration.PassengerRestClient;
import com.example.demo.integration.ReservationRestClient;

@Controller
public class CheckInController {
	
	@Autowired
	ReservationRestClient restClient;
	
	@Autowired
	PassengerRestClient passengerRestClient;

	@RequestMapping("showStartCheckIn")
	public String showStartCheckIn() {
		return "startCheckIn";
	}
	
	@RequestMapping("startCheckIn")
	public String startCheckIn(@RequestParam("reservationId") long reservationId, ModelMap modelMap){
		Reservation reservation = restClient.findReservation(reservationId);
		Passenger passengers = passengerRestClient.findPassengers(reservationId);
		modelMap.addAttribute("reservation",reservation);
		modelMap.addAttribute("passenger",passengers);
		return "displayReservationDetails";
	}
	
	@RequestMapping("completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") long reservationId,int numberOfBags) {
		ReservationUpdateRequest reservationUpdateRequest = new ReservationUpdateRequest();
		reservationUpdateRequest.setId(reservationId);
		reservationUpdateRequest.setCheckedIn(true);
		reservationUpdateRequest.setNumberOfBags(numberOfBags);
		restClient.updateReservation(reservationUpdateRequest);
		return "checkInConfirmation";
		
	}
	
}
