package com.spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Entity
@Table(name = "BOOKING")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "bookingId")
public class Booking {

	@Id
	@Column(name = "BOOKINGID")
	private int bookingId;

	@Column(name = "TRAINID")
	private int trainId;

	@Column(name = "PASSENGERS")
	private int passengers;

	@Column(name = "USERID")
	private String userId;

	@OneToMany(mappedBy = "booking")
	private List<Seat> seat = new ArrayList<>();

	public Booking() {
	}

	public Booking(int bookingId, int trainId, int passengers, String userId) {
		this.bookingId = bookingId;
		this.trainId = trainId;
		this.passengers = passengers;
		this.userId = userId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
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

	public List<Seat> getSeat() {
		return seat;
	}

	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}

}