package com.spring.service;

import java.util.List;

import com.spring.dto.BookingDTO;
import com.spring.entity.Booking;
import com.spring.entity.SourceDestination;
import com.spring.entity.Trains;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
public interface TrainsServiceDAO {
	
	public List<SourceDestination> listAllSourceDestination();
	
	public List<Trains> listAllTrainsBySdId(int sourceId, int destinationId, String date);
	
	public String getCurrentDate();
	
	public String trainBooking(BookingDTO booking);
	
	public List<Booking> listBookings(String userId);
	


}
