package com.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PersonDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personId;
	private String personName;
	private String personDesc;
	
	@OneToMany(mappedBy="pd")
	Collection<Vehicle> vehicle = new ArrayList<>();
	
	@OneToOne
	PersonPersonalDetails ppd;
	

	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}

	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	/**
	 * @return the personDesc
	 */
	public String getPersonDesc() {
		return personDesc;
	}

	/**
	 * @param personDesc the personDesc to set
	 */
	public void setPersonDesc(String personDesc) {
		this.personDesc = personDesc;
	}

	/**
	 * @return the vehicle
	 */
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	/**
	 * @return the ppd
	 */
	public PersonPersonalDetails getPpd() {
		return ppd;
	}

	/**
	 * @param ppd the ppd to set
	 */
	public void setPpd(PersonPersonalDetails ppd) {
		this.ppd = ppd;
	}
	
	
}
