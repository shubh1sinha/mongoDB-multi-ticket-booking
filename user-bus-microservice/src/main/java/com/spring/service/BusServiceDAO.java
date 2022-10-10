package com.spring.service;

import java.util.List;

import com.spring.dto.BusBookingDTO;
import com.spring.entity.Bus;
import com.spring.entity.BusBooking;

/****
 * 
 * @author shubh-sinha
 * @project Multi-ticket booking
 *
 */
public interface BusServiceDAO {
	
	public Bus giveBusRouteByJoining();
	
	public List<Bus> findAllBus();
	
	public List<Bus> findAllBusbySrcnDstns(String name);
	
	public String bookBus(BusBookingDTO booking);
	
	public List<BusBooking> viewAllBookingsById(String userId);
	

}
