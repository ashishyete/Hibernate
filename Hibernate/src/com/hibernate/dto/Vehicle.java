package com.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	private String vehicleName;
	private String vehicleModel;
	
	@ManyToOne
	@JoinColumn(name="Person_Id")
	private PersonDetails pd;
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
	 * @return the vehicleModel
	 */
	public String getVehicleModel() {
		return vehicleModel;
	}
	/**
	 * @param vehicleModel the vehicleModel to set
	 */
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	/**
	 * @return the pd
	 */
	public PersonDetails getPd() {
		return pd;
	}
	/**
	 * @param pd the pd to set
	 */
	public void setPd(PersonDetails pd) {
		this.pd = pd;
	}
	
}
