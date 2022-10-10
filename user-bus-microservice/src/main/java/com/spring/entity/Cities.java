package com.spring.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/****
 * 
 * @project Multi-ticket booking
 * @author shubh-sinha
 * @author ashu-mittal
 *
 */
@Entity
@Table(name="CITIES")
public class Cities {
	
	@Id
	@Column(name="CITYID")
	private int cityId;
	
	@Column(name="CITYNAME")
	private String cityName;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "routes")
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
