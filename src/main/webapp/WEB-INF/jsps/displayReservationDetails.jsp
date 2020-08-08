<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ReservationDetails</title>
</head>
<body>
<%-- 	<h2>Flight Details</h2>
	Airlines : ${reservation.flight.operatingAirlines} </br>
	Flight number : ${reservation.flight.flightNumber}  </br>
	Departure City : ${reservation.flight.departureCity} </br>
	Arrival City : ${reservation.flight.arrivalCity} </br> 
	Date of Departure : ${reservation.flight.dateOfDeparture} </br>
--%>
	<h2>Passenger Details</h2>
	First Name : ${passenger.firstName} </br>
	Last Name : ${passenger.lastName}  </br>
	Email : ${passenger.email} </br>
	Phone : ${passenger.phone} </br> 
	
	<h2>Flight Check In Details</h2>
	CheckIn Status : ${reservation.checkedIn}</br>
	Flight ID : ${reservation.flightid}</br>

	<form action="completeCheckIn">
		Enter the number of bags to checkIn:<input type="text" name="numberOfBags" /> 
		<input type="hidden" value="${reservation.id}" name="reservationId" />
		<input type="submit" value="CheckIn" />
	</form>
</body>
</html>