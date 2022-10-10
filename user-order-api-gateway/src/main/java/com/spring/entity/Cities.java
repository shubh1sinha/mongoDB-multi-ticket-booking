package com.spring.entity;

import java.util.HashSet;
import java.util.Set;

/****
 * 
 * @project Multi-ticket booking
 * @author shubh-sinha
 * @author ashu-mittal
 *
 */

public class Cities {

	private int cityId;

	private String cityName;

	private Set<Bus> buses = new HashSet<Bus>();

	public Cities() {
	}

	public Cities(int cityId, String cityName) {
		this.cityId = cityId;
		this.cityName = cityName;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Set<Bus> getBuses() {
		return buses;
	}

	public void setBuses(Set<Bus> buses) {
		this.buses = buses;
	}

}
