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
@Table(name = "SOURCEDESTINATION")
public class SourceDestination {

	@Id
	@Column(name = "SDID")
	private int sdId;

	@Column(name = "SDNAME")
	private String sdName;

	public SourceDestination() {
	}

	public SourceDestination(int sdId, String sdName) {
		this.sdId = sdId;
		this.sdName = sdName;
	}

	public int getSdId() {
		return sdId;
	}

	public void setSdId(int sdId) {
		this.sdId = sdId;
	}

	public String getSdName() {
		return sdName;
	}

	public void setSdName(String sdName) {
		this.sdName = sdName;
	}

}