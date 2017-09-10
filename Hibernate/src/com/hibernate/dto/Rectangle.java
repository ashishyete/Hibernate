package com.hibernate.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Rectangle_Class")
public class Rectangle extends ShapeDetails {

	private int numberOfSides;

	/**
	 * @return the numberOfSides
	 */
	public int getNumberOfSides() {
		return numberOfSides;
	}

	/**
	 * @param numberOfSides the numberOfSides to set
	 */
	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
	
	
	
	
}
