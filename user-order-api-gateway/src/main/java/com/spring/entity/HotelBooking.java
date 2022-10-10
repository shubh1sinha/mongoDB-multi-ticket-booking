package com.spring.entity;

/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */

public class HotelBooking {

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
