package com.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.BookingDTO;
import com.spring.dto.TrainsDTO;
import com.spring.entity.Booking;
import com.spring.entity.SourceDestination;
import com.spring.entity.Trains;
import com.spring.service.TrainsServiceDAO;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@RestController
public class TrainsRestController {

	@Autowired
	private TrainsServiceDAO trainService;
	
	
	/***
	 * 
	 * @return List of source-destination
	 */
	@GetMapping(value="/sd/list", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<SourceDestination> viewAllSourceDestination(){
		return trainService.listAllSourceDestination();
	}
	
	/***
	 * 
	 * @return List of trains by
	 * source destination
	 */
	@PostMapping(value="/trains", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Trains> viewAllTrainbySourceDestination(@RequestBody TrainsDTO trains){
		return trainService.listAllTrainsBySdId(trains.getSourceId(), trains.getDestinationId(),trains.getDeparture());
	}
	
	/***
	 * 
	 * @param booking
	 * @return booking-seat
	 */
	@PostMapping(value="/bookings", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addBookingsAndSeats(@RequestBody BookingDTO booking){
		 String response = trainService.trainBooking(booking);
		 return ResponseEntity.ok("{\"status\" : \" "+response+"\"}");
	}
	
	/***
	 * 
	 * @return List of Bookings
	 */
	@GetMapping(value="/booking/list/{userId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Booking> viewAllBookings(@PathVariable("userId") String userId){
		return trainService.listBookings(userId);
	}

}