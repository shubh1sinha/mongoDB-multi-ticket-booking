package com.spring.entity;

/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */

public class Hotel {

	private int hotelId;

	private String name;

	private String city;

	private String facilities;

	public Hotel() {
	}

	public Hotel(int hotelId, String name, String city, String facilities) {
		this.hotelId = hotelId;
		this.name = name;
		this.city = city;
		this.facilities = facilities;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

}
