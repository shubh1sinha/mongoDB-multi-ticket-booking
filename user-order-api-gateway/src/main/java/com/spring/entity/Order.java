package com.spring.entity;

import java.util.List;

public class Order {

	private Registration user;

	private List<Booking> train;

	private List<HotelBooking> hotel;

	private List<BusBooking> bus;
	
	

	public Order() {
	}

	public Order(Registration user, List<Booking> train, List<HotelBooking> hotel, List<BusBooking> bus) {
		this.user = user;
		this.train = train;
		this.hotel = hotel;
		this.bus = bus;
	}

	public Registration getUser() {
		return user;
	}

	public void setUser(Registration user) {
		this.user = user;
	}

	public List<Booking> getTrain() {
		return train;
	}

	public void setTrain(List<Booking> train) {
		this.train = train;
	}

	public List<HotelBooking> getHotel() {
		return hotel;
	}

	public void setHotel(List<HotelBooking> hotel) {
		this.hotel = hotel;
	}

	public List<BusBooking> getBus() {
		return bus;
	}

	public void setBus(List<BusBooking> bus) {
		this.bus = bus;
	}

}
