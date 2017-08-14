/**
 * 
 */
package com.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author Ashish
 *
 */
@Embeddable
public class OfficePrimary implements Serializable {

	private int officeId;
	private int officePriority;
	private int totalEmp;
	/**
	 * @return the officeId
	 */
	public int getOfficeId() {
		return officeId;
	}
	/**
	 * @param officeId the officeId to set
	 */
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	/**
	 * @return the officePriority
	 */
	public int getOfficePriority() {
		return officePriority;
	}
	/**
	 * @param officePriority the officePriority to set
	 */
	public void setOfficePriority(int officePriority) {
		this.officePriority = officePriority;
	}
	/**
	 * @return the totalEmp
	 */
	public int getTotalEmp() {
		return totalEmp;
	}
	/**
	 * @param totalEmp the totalEmp to set
	 */
	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}
	

}
