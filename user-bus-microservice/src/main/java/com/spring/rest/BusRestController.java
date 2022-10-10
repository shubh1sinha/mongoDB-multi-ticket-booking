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

import com.spring.dto.BusBookingDTO;
import com.spring.entity.Bus;
import com.spring.entity.BusBooking;
import com.spring.service.BusServiceDAO;

/****
 * @project Multi-ticket-booking
 * @author shubh-sinha
 * @author ashu-mittal
 *
 */
@RestController
public class BusRestController {

	@Autowired
	private BusServiceDAO busService;

	/***
	 * 
	 * @method Join Bus and route
	 *   	 Only for admin
	 */
	@PostMapping(value = "/bus/routes")
	public Bus joinTables() {
		return busService.giveBusRouteByJoining();
	}

	/***
	 * 
	 * @return list of bus
	 */
	@GetMapping(value = "/bus")
	public List<Bus> busList() {
		return busService.findAllBus();
	}
	
	/***
	 * 
	 * @param name
	 * @return list of bus by srcdestnation
	 */
	@GetMapping(value = "/bus/list/{name}")
	public List<Bus> busListBySrcDestntn(@PathVariable("name") String name) {
		return busService.findAllBusbySrcnDstns(name);
	}
	
	/***
	 * 
	 * @param booking
	 * @return
	 */
	
	@PostMapping(value="/bus/book", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> bookHotels(@RequestBody BusBookingDTO booking){
		String response = busService.bookBus(booking);
		return ResponseEntity.ok("{\"status\" : \" "+response+"\"}");
	}
	
	/***
	 * 
	 * @param username
	 * @return list of booking by user
	 */
	@GetMapping(value = "/booking/list/{username}")
	public List<BusBooking> bookingListByUsername(@PathVariable("username") String username) {
		return busService.viewAllBookingsById(username);
	}

}
