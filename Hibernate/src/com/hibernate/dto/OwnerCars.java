/**
 * 
 */
package com.hibernate.dto;

import javax.persistence.Embeddable;

/**
 * @author Ashish
 *
 */
@Embeddable
public class OwnerCars {

	private String carName;
	private String carType;
	private Double carValue;
	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}
	/**
	 * @param carName the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}
	/**
	 * @return the carType
	 */
	public String getCarType() {
		return carType;
	}
	/**
	 * @param carType the carType to set
	 */
	public void setCarType(String carType) {
		this.carType = carType;
	}
	/**
	 * @return the carValue
	 */
	public Double getCarValue() {
		return carValue;
	}
	/**
	 * @param carValue the carValue to set
	 */
	public void setCarValue(Double carValue) {
		this.carValue = carValue;
	}
	
	
	
}
