/**
 * 
 */
package com.hibernate.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Ashish
 *
 */

@Entity
public class PersonDetails {
	
	@Id
	@GeneratedValue
	@Column(name="PERSON_ID")
	private int personId;
	@Column(name="PERSON_NAME")
	private String personName;
	@Column(name="PERSON_AGE")
	private String personAge;
	@Temporal(TemporalType.DATE)
	private Date personDOB;
	
	// one to one Mapping
	@OneToOne
	private Vehicle vehicle;
	
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
	 * @return the personAge
	 */
	public String getPersonAge() {
		return personAge;
	}
	/**
	 * @param personAge the personAge to set
	 */
	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}
	/**
	 * @return the personDOB
	 */
	public Date getPersonDOB() {
		return personDOB;
	}
	/**
	 * @param personDOB the personDOB to set
	 */
	public void setPersonDOB(Date personDOB) {
		this.personDOB = personDOB;
	}
	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}
	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}
