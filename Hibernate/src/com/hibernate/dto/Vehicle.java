/**
 * 
 */
package com.hibernate.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Ashish
 *
 */

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name="VEHICLE_ID")
	private int vehicleId;
	@Column(name="VEHICLE_NAME",nullable=false, length=12)
	private String vehicleName;
	@Temporal(TemporalType.DATE)
	private Date dateOfPurchase;
	/**
	 * @return the vehicleId
	 */
	public int getVehicleId() {
		return vehicleId;
	}
	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	/**
	 * @return the vehicleName
	 */
	public String getVehicleName() {
		return vehicleName;
	}
	/**
	 * @param vehicleName the vehicleName to set
	 */
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	/**
	 * @return the dateOfPurchase
	 */
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	/**
	 * @param dateOfPurchase the dateOfPurchase to set
	 */
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	
	
}
