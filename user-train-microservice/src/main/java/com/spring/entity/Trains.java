package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Entity
@Table(name="TRAINS")
public class Trains {
	
	@Id
	@Column(name="TRAINID")
	private int trainId;
	
	@Column(name="TRAINNAME")
	private String trainName;
	
	@Column(name="SOURCEID")
	private int sourceId;
	
	@Column(name="DESTINATIONID")
	private int destinationId;
	
	@Column(name="TOURMAP")
	private String tourMap;
	
	@Column(name="DEPARTURE")
	private String departure;
	
	@Column(name="SEATS")
	private int seats;

	public Trains() {
	}

	public Trains(int trainId, String trainName, int sourceId, int destinationId, String tourMap,
			String departure, int seats) {
		this.trainId = trainId;
		this.trainName = trainName;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.tourMap = tourMap;
		this.departure = departure;
		this.seats=seats;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}

	public String getTourMap() {
		return tourMap;
	}

	public void setTourMap(String tourMap) {
		this.tourMap = tourMap;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}
	
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	

}