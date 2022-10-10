package com.spring.entity;

/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */

public class SourceDestination {

	private int sdId;

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
