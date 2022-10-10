package com.spring.entity;

/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */

public class Seat {

	private int seatId;

	private int seatNo;

	private int trainId;

	private String status;

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
