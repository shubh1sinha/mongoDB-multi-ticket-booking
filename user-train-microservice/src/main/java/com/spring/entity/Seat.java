package com.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Entity
@Table(name = "SEAT")
public class Seat {

	@Id
	@Column(name = "SEATID")
	private int seatId;

	@Column(name = "SEATNO")
	private int seatNo;

	@Column(name = "TRAINID")
	private int trainId;

	@Column(name = "status")
	private String status;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BOOKINGID", referencedColumnName = "BOOKINGID")
	private Booking booking;

	public Seat() {
	}

	public Seat(int seatNo, int trainId, String status, int seatId) {
		this.seatNo = seatNo;
		this.trainId = trainId;
		this.status = status;
		this.seatId = seatId;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	

}