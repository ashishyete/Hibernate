/**
 * 
 */
package com.hibernate.dto;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author Ashish
 *
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name ="SHAPE_DETAILS",discriminatorType=DiscriminatorType.STRING
		)
public class ShapeDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int shapeId;
	private String shapeDesc;
	/**
	 * @return the shapeId
	 */
	public int getShapeId() {
		return shapeId;
	}
	/**
	 * @param shapeId the shapeId to set
	 */
	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}
	/**
	 * @return the shapeDesc
	 */
	public String getShapeDesc() {
		return shapeDesc;
	}
	/**
	 * @param shapeDesc the shapeDesc to set
	 */
	public void setShapeDesc(String shapeDesc) {
		this.shapeDesc = shapeDesc;
	}
	
}
