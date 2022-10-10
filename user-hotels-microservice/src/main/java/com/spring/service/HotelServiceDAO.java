package com.spring.service;

import java.util.List;

import com.spring.dto.HotelBookingDTO;
import com.spring.entity.Hotel;
import com.spring.entity.HotelBooking;


public interface HotelServiceDAO {
	
	public List<Hotel> findAllByCity(String city);
	
	public String bookHotel(HotelBookingDTO booking);
	
	public List<HotelBooking> listHotelByuserId(String userId);

}
