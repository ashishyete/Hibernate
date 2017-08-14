/**
 * 
 */
package com.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Ashish
 *
 */
@Embeddable
public class Address {
	
	@Column(name="Street_Name")
	private String street;
	@Column(name="city_name")
	private String city;
	@Column(name ="state_name")
	private String state;
	@Column(name ="Zip_code")
	private String zip;
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	

}
