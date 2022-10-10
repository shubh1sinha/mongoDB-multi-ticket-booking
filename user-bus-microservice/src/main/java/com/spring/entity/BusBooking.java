package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * 
 * @project Multi-Ticker-Booking
 * @author shubh-sinha
 * @author ashu-mittal
 *
 */
@Entity
@Table(name = "BUSBOOKING")
public class BusBooking {

	@Id
	@Column(name = "BOOKINGID")
	private int bookingId;

	@Column(name = "BUSID")
	private int busId;

	@Column(name = "PASSENGERS")
	private int passengers;

	@Column(name = "USERID")
	private String userId;

	@Column(name = "BOARDING")
	private String boarding;

	@Column(name = "DROPPING")
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
