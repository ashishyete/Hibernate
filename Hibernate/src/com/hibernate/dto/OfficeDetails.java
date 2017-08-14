/**
 * 
 */
package com.hibernate.dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Ashish
 *
 */
@Entity
@Table(name="Office_Details")
public class OfficeDetails {
	
	
	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name="officeId",column=@Column(name="Office_ID")),
		@AttributeOverride(name="officePriority",column=@Column(name="Office_Priority")),
		@AttributeOverride(name="totalEmp",column=@Column(name="Emp_TOTAL"))
	})
	private OfficePrimary officePrimary;
	@Column(name="Office_Name")
	private String officeName;
	@Column(name="Branch_Name")
	private String BranchName;
	@Column(name="Office_Location")
	private String Location;
	/**
	 * @return the officePrimary
	 */
	public OfficePrimary getOfficePrimary() {
		return officePrimary;
	}
	/**
	 * @param officePrimary the officePrimary to set
	 */
	public void setOfficePrimary(OfficePrimary officePrimary) {
		this.officePrimary = officePrimary;
	}
	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return officeName;
	}
	/**
	 * @param officeName the officeName to set
	 */
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return BranchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		BranchName = branchName;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return Location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		Location = location;
	}
	

}
