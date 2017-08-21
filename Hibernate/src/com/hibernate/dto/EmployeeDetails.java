/**
 * 
 */
package com.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author Ashish
 *
 */
@Entity
@Table(name="EMP_DETAILS")
public class EmployeeDetails {

	@Id
	private int empId;
	private String empName;
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	@Transient
	private String Address;
	@Lob
	private String description;
	//No Primary key for Collection Object
	@ElementCollection
	@JoinTable(name="USER_ADDRESS",joinColumns=@JoinColumn(name="Employee_Id"))
	private Set<Address> listOfAddress;
	
	//Primary Key for collection object
	@GenericGenerator(name="sequence-gen",strategy="sequence")
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="USER_ADDR",joinColumns=@JoinColumn(name="Emp_Id"))
	@CollectionId(columns = { @Column(name="Addr_Id") }, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<Address> listOfAddr = new ArrayList<>();
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the joinedDate
	 */
	public Date getJoinedDate() {
		return joinedDate;
	}
	/**
	 * @param joinedDate the joinedDate to set
	 */
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the listOfAddress
	 */
	public Set<Address> getListOfAddress() {
		return listOfAddress;
	}
	/**
	 * @param listOfAddress the listOfAddress to set
	 */
	public void setListOfAddress(Set<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	/**
	 * @return the listOfAddr
	 */
	public Collection<Address> getListOfAddr() {
		return listOfAddr;
	}
	/**
	 * @param listOfAddr the listOfAddr to set
	 */
	public void setListOfAddr(Collection<Address> listOfAddr) {
		this.listOfAddr = listOfAddr;
	}
	
	
}
