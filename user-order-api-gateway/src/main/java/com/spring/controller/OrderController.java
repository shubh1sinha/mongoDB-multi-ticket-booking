package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.spring.entity.Booking;
import com.spring.entity.BusBooking;
import com.spring.entity.HotelBooking;
import com.spring.entity.Order;
import com.spring.entity.Registration;

/***
 * 
 * @project Multi-Ticket booking
 * @author shubh-sinha
 * @author ashu-mittal	
 *
 */
@Controller
public class OrderController {

	@Autowired
	private RestTemplate rt;

	/***
	 * 
	 * @param username
	 * @method Collecting all orders of bus trains, hotels and user information in
	 *         one entity
	 * @return registration info, train bookings and seats, hotel booking and bus
	 *         booking
	 */
	@GetMapping(value = "user/booking/{username}")
	public ResponseEntity<Order> userOrderDetails(@PathVariable("username") String username) {

		ResponseEntity<Registration> userDetails = rt.exchange("http://localhost:9191/user/find/" + username,
				HttpMethod.GET, null, new ParameterizedTypeReference<Registration>() {
				});
		ResponseEntity<List<Booking>> trainBooking = rt.exchange("http://localhost:9192/booking/list/" + username,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Booking>>() {
				});
		ResponseEntity<List<HotelBooking>> hotelBooking = rt.exchange("http://localhost:9193/booking/list/" + username,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<HotelBooking>>() {
				});
		ResponseEntity<List<BusBooking>> busBooking = rt.exchange("http://localhost:9194/booking/list/" + username,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<BusBooking>>() {
				});

		Order order = new Order();
		order.setUser(userDetails.getBody());
		order.setTrain(trainBooking.getBody());
		order.setHotel(hotelBooking.getBody());
		order.setBus(busBooking.getBody());

		return ResponseEntity.ok(order);

	}

}
