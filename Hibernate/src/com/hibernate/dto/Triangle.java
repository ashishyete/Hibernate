/**
 * 
 */
package com.hibernate.dto;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Ashish
 *
 */

@Entity
@DiscriminatorValue("Triangle_Class")
public class Triangle extends ShapeDetails {

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
