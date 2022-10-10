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

import com.spring.dto.HotelBookingDTO;
import com.spring.entity.Hotel;
import com.spring.entity.HotelBooking;
import com.spring.service.HotelServiceDAO;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@RestController
public class HotelRestController {
	
	@Autowired
	private HotelServiceDAO hotelService;
	
	/***
	 * 
	 * @param city
	 * @return
	 */
	@GetMapping(value="/hotel/list/{city}", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> getHotelsByCity(@PathVariable("city") String city){
		return hotelService.findAllByCity(city);
	}
	
	/***
	 * 
	 * @param booking
	 * @return
	 */
	@PostMapping(value="/hotel/book", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> bookHotels(@RequestBody HotelBookingDTO booking){
		String response = hotelService.bookHotel(booking);
		return ResponseEntity.ok("{\"status\" : \" "+response+"\"}");
	}
	
	/***
	 * 
	 * @return List of Bookings by id
	 */
	@GetMapping(value="/booking/list/{userId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<HotelBooking> viewAllBookings(@PathVariable("userId") String userId){
		return hotelService.listHotelByuserId(userId);
	}
	

}
