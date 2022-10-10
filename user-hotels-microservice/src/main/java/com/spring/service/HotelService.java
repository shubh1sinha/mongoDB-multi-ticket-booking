package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dto.HotelBookingDTO;
import com.spring.entity.Hotel;
import com.spring.entity.HotelBooking;
import com.spring.repo.HotelBookingRepository;
import com.spring.repo.HotelRepository;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Service
public class HotelService implements HotelServiceDAO{

	@Autowired
	private HotelRepository hotelRepo;
	
	@Autowired
	private HotelBookingRepository bookingRepo;

	/***
	 * @param cuty
	 * @return list of hotels
	 *  by city
	 */
	@Override
	public List<Hotel> findAllByCity(String city) {
		return hotelRepo.findAllByCity(city);
	}

	/***
	 * @method submit hotel booking
	 * @param booking
	 */
	@Override
	public String bookHotel(HotelBookingDTO booking) {
		HotelBooking hotelBooking = new HotelBooking();
		hotelBooking.setHotelId(booking.getHotelId());
		hotelBooking.setGuests(booking.getGuests());
		hotelBooking.setUserId(booking.getUserId());
		hotelBooking.setRoomType(booking.getRoomType());
		bookingRepo.save(hotelBooking);
		return "Booking Done Successfully!";
	}

	/***
	 * @param userId
	 * @return list-hotel by userId
	 */
	@Override
	public List<HotelBooking> listHotelByuserId(String userId) {
		return bookingRepo.findAllByUserId(userId);
	}
	
	
}
