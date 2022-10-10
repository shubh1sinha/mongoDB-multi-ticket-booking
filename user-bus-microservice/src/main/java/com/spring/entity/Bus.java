package com.spring.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/****
 * 
 * @project Multi-ticket booking
 * @author shubh-sinha
 * @author ashu-mittal
 *
 */
@Entity
@Table(name = "BUS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "busId")
public class Bus {

	@Id
	@Column(name = "BUSID")
	private int busId;

	@Column(name = "BUSNAME")
	private String busName;

	@Column(name = "SRCDESTN")
	private String srcDestn;

	@Column(name = "FROMDATE")
	private String fromDate;

	@Column(name = "SEATS")
	private int seats;

	@ManyToMany
	@JoinTable(name = "ROUTES", joinColumns = @JoinColumn(name = "BUSID"), inverseJoinColumns = @JoinColumn(name = "CITYID"))
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
