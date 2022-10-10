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

public class Bus {

	private int busId;

	private String busName;

	private String srcDestn;

	private String fromDate;

	private int seats;

	private Set<Cities> routes = new HashSet<Cities>();

	public Bus() {
	}

	public Bus(int busId, String busName, String srcDestn, String fromDate, int seats) {
		this.busId = busId;
		this.busName = busName;
		this.srcDestn = srcDestn;
		this.fromDate = fromDate;
		this.seats = seats;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getSrcDestn() {
		return srcDestn;
	}

	public void setSrcDestn(String srcDestn) {
		this.srcDestn = srcDestn;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public Set<Cities> getRoutes() {
		return routes;
	}

	public void setRoutes(Set<Cities> routes) {
		this.routes = routes;
	}

}
