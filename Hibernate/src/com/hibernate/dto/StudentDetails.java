/**
 * 
 */
package com.hibernate.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Ashish
 *
 */

@Entity
@Table(name="Student_Details")
public class StudentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="roll_no")
	private int rollNo;
	@Column(name="student_name")
	private String name;
	@Column(name="Class_Name")
	private String className;
	@Column(name="Section_Name")
	private String sectionName;
	@Temporal(TemporalType.DATE)
	private Date Dob;
	@Temporal(TemporalType.TIME)
	private Date timeEntry;
	@Lob
	private String studentDescription;
	
	@AttributeOverrides({
	@AttributeOverride(name="street",column=@Column(name="Sch_Street_name")),
	@AttributeOverride(name="state",column=@Column(name="Sch_State_name")),
	@AttributeOverride(name="city",column=@Column(name="Sch_city_name")),
	@AttributeOverride(name="zip",column=@Column(name="Sch_zip_code"))
	})
	private Address schAddress;
	
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="home_Street_name")),
		@AttributeOverride(name="state",column=@Column(name="home_State_name")),
		@AttributeOverride(name="city",column=@Column(name="home_city_name")),
		@AttributeOverride(name="zip",column=@Column(name="home_zip_code"))
	})
	private Address homeAddress;
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the sectionName
	 */
	public String getSectionName() {
		return sectionName;
	}
	/**
	 * @param sectionName the sectionName to set
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	/**
	 * @return the studentDescription
	 */
	public String getStudentDescription() {
		return studentDescription;
	}
	/**
	 * @param studentDescription the studentDescription to set
	 */
	public void setStudentDescription(String studentDescription) {
		this.studentDescription = studentDescription;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return Dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		Dob = dob;
	}
	/**
	 * @return the timeEntry
	 */
	public Date getTimeEntry() {
		return timeEntry;
	}
	/**
	 * @param timeEntry the timeEntry to set
	 */
	public void setTimeEntry(Date timeEntry) {
		this.timeEntry = timeEntry;
	}
	/**
	 * @return the schAddress
	 */
	public Address getSchAddress() {
		return schAddress;
	}
	/**
	 * @param schAddress the schAddress to set
	 */
	public void setSchAddress(Address schAddress) {
		this.schAddress = schAddress;
	}
	/**
	 * @return the homeAddress
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}
	/**
	 * @param homeAddress the homeAddress to set
	 */
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	
	
}
