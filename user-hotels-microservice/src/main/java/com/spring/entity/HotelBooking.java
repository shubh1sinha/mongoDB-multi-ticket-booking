package com.spring.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.GeneratorType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Document(collection = "hotelbooking")
public class HotelBooking {

	@Id
	private String bookingId;

	private int hotelId;

	private int guests;

	private String userId;

	private String roomType;

	public HotelBooking() {
	}

	public HotelBooking(String bookingId, int hotelId, int guests, String userId, String roomType) {
		this.bookingId = bookingId;
		this.hotelId = hotelId;
		this.guests = guests;
		this.userId = userId;
		this.roomType = roomType;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	

}
