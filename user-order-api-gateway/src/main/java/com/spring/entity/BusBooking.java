package com.spring.entity;

/***
 * 
 * @project Multi-Ticker-Booking
 * @author shubh-sinha
 * @author ashu-mittal
 *
 */

public class BusBooking {

	private int bookingId;

	private int busId;

	private int passengers;

	private String userId;

	private String boarding;

	private String dropping;

	public BusBooking() {
	}

	public BusBooking(int bookingId, int busId, int passengers, String userId, String boarding, String dropping) {
		this.bookingId = bookingId;
		this.busId = busId;
		this.passengers = passengers;
		this.userId = userId;
		this.boarding = boarding;
		this.dropping = dropping;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getDropping() {
		return dropping;
	}

	public void setDropping(String dropping) {
		this.dropping = dropping;
	}

}
